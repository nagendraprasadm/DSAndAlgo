package org.nm.dsalgo.problems.others;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * 
 * 
 * An encoded string S is given. To find and write the decoded string to a tape,
 * the encoded string is read one character at a time and the following steps
 * are taken:
 * 
 * If the character read is a letter, that letter is written onto the tape. If
 * the character read is a digit (say d), the entire current tape is repeatedly
 * written d-1 more times in total. Now for some encoded string S, and an index
 * K, find and return the K-th letter (1 indexed) in the decoded string.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: S = "leet2code3", K = 10 Output: "o" Explanation: The decoded string
 * is "leetleetcodeleetleetcodeleetleetcode". The 10th letter in the string is
 * "o". Example 2:
 * 
 * Input: S = "ha22", K = 5 Output: "h" Explanation: The decoded string is
 * "hahahaha". The 5th letter is "h". Example 3:
 * 
 * Input: S = "a2345678999999999999999", K = 1 Output: "a" Explanation: The
 * decoded string is "a" repeated 8301530446056247680 times. The 1st letter is
 * "a".
 * 
 * 
 * Note:
 * 
 * 2 <= S.length <= 100 S will only contain lowercase letters and digits 2
 * through 9. S starts with a letter. 1 <= K <= 10^9 The decoded string is
 * guaranteed to have less than 2^63 letters.
 * 
 * @author Nagendra
 *
 */

public class DecodeStringAtIndex {

	private static final Logger logger = LoggerFactory.getLogger(DecodeStringAtIndex.class);

	public String decodeAtIndex(String S, int K) {
		logger.debug("Input String [{}] Index [{}]", S, K);
		int len = S.length();
		double[] decLen = new double[len];
		int encIdx = -1;
		double decIdx = K;
		char[] charArr = S.toCharArray();
		logger.debug("Starting the first loop");
		for (int i = 0; i < len; i++) {
			double prevLen = i == 0 ? 0 : decLen[i - 1];
			char curChar = charArr[i];
			if (Character.isLetter(curChar)) {
				logger.debug("\tCharacter at [{}] is letter [{}]", i, curChar);
				decLen[i] = prevLen + 1;
				logger.debug("\t\tDecrypted Length Set to {}", decLen[i]);
				if (decLen[i] == K) {
					logger.debug("\t\tCharacter Found for input String {} and index {} - [{}]",
							new Object[] { S, K, new String(new char[] { curChar }) });
					return new String(new char[] { curChar });
				}
			} else if (Character.isDigit(curChar)) {
				logger.debug("\tCharacter at [{}] is Integer [{}]", i, curChar);
				int curInt = Character.getNumericValue(curChar);
				decLen[i] = prevLen + ((curInt - 1) * prevLen);
				logger.debug("\t\tDecrypted Length Set to {}", decLen[i]);
				if (decLen[i] >= K) {
					logger.debug("\t\tProcessing integer at Ecrypted String index [{}] Its Decrypted Length [{}]", i,
							decLen[i]);
					encIdx = i;
					break;
				}
			}
		}

		logger.debug("Starting Second Loop Encrypted End Index [{}]", encIdx);
		if (encIdx > -1) {
			while (encIdx >= 0) {

				char curChar = charArr[encIdx];

				if (decIdx == 0) {
					logger.debug("Decrypted Index is 0 returned character is - {}", new String(new char[] { curChar }));
					return new String(new char[] { curChar });
				}

				if (Character.isDigit(curChar)) {
					logger.debug("\tCharacter at Encrypted index {} is integer {}", encIdx,
							Character.getNumericValue(curChar));
					if (decLen[encIdx] > decIdx) {
						logger.debug(
								"\t\tEncrypted Index {} Decrypted String length {} and previous decrypted length {}",
								new Object[] { encIdx, decLen[encIdx], decLen[encIdx - 1] });
						double prevLen = decLen[encIdx - 1];
						logger.debug("\t\tDecrypted Index Originial {} ", decIdx);
						if(prevLen <= decIdx) {
							double rem = decIdx % prevLen;
							if (rem == 0 && decIdx > prevLen) {
								decIdx = prevLen;
							} else {
								decIdx = rem;
							}
						}
						logger.debug("\t\tDecrypted Index Changed {} ", decIdx);
					} else {
						if (Character.isDigit(charArr[encIdx - 1])) {
							encIdx--;
							continue;
						} else {
							logger.debug("\t\tCharacter Found for input string {} index {} - [{}]",
									new Object[] { S, K, new String(new char[] { charArr[encIdx - 1] }) });
							return new String(new char[] { charArr[encIdx - 1] });
						}
					}
				} else if (Character.isLetter(curChar)) {
					logger.debug("\tCharacter at Encrypted index {} is Character {}", encIdx, curChar);
					if (decLen[encIdx] == decIdx) {
						logger.debug("\t\tCharacter Found is [{}]", new String(new char[] { curChar }));
						return new String(new char[] { curChar });
					}
				}
				encIdx--;
			}

		} else {
			throw new RuntimeException("Index to search backwards cannot be -1");
		}
		return "NF";
	}

	public String getDecodedString(String S) {
		StringBuilder strBuilder = new StringBuilder();
		char[] charArr = S.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			char curChar = charArr[i];
			if (Character.isLetter(curChar)) {
				strBuilder.append(new String(new char[] { curChar }));
			} else if (Character.isDigit(curChar)) {
				int curInt = Character.getNumericValue(curChar);
				String curStr = strBuilder.toString();
				StringBuilder temp = new StringBuilder();
				for (int j = 0; j < curInt - 1; j++) {
					temp.append(curStr);
				}
				strBuilder.append(temp);
				System.gc();
			}
			
		}
		return strBuilder.toString();
	}
}
