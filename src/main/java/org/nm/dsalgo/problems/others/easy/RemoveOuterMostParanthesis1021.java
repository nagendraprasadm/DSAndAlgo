package org.nm.dsalgo.problems.others.easy;

/**
 * <pre>
 *
 *     A valid parentheses string is either empty (""), "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.  For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
 *
 * A valid parentheses string S is primitive if it is nonempty, and there does not exist a way to split it into S = A+B, with A and B nonempty valid parentheses strings.
 *
 * Given a valid parentheses string S, consider its primitive decomposition: S = P_1 + P_2 + ... + P_k, where P_i are primitive valid parentheses strings.
 *
 * Return S after removing the outermost parentheses of every primitive string in the primitive decomposition of S.
 *
 *
 *
 * Example 1:
 *
 * Input: "(()())(())"
 * Output: "()()()"
 * Explanation:
 * The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
 * After removing outer parentheses of each part, this is "()()" + "()" = "()()()".
 *
 * Example 2:
 *
 * Input: "(()())(())(()(()))"
 * Output: "()()()()(())"
 * Explanation:
 * The input string is "(()())(())(()(()))", with primitive decomposition "(()())" + "(())" + "(()(()))".
 * After removing outer parentheses of each part, this is "()()" + "()" + "()(())" = "()()()()(())".
 *
 * Example 3:
 *
 * Input: "()()"
 * Output: ""
 * Explanation:
 * The input string is "()()", with primitive decomposition "()" + "()".
 * After removing outer parentheses of each part, this is "" + "" = "".
 *
 *
 *
 * Note:
 *
 *     S.length <= 10000
 *     S[i] is "(" or ")"
 *     S is a valid parentheses string
 * </pre>
 */
public class RemoveOuterMostParanthesis1021
{
    public String removeOuterParentheses(String S) {
        StringBuilder result = new StringBuilder();
        int openBraces = 0;
        int start = 0;
        int end = 0;
        for(int i = 0; i < S.length() ; i++){
            if(S.charAt(i) == ')'){
                openBraces--;
            }else{
                openBraces++;
            }

            if(openBraces == 0){
                end = i;
                result.append(S.substring(start + 1, end));
                start = i+1;
            }
        }
        return result.toString();
    }


    public String removeOuterParenthesesCharArray(String S) {
        char[] inArr = S.toCharArray();
        char[] resultArr = new char[inArr.length];
        int bracesCnt = 0;
        int outIncr = 0;
        for(int i = 0; i < inArr.length ; i++){
            if(inArr[i] == ')'){
                bracesCnt--;
                if(bracesCnt != 0){
                    resultArr[outIncr++] = ')';
                }
            }else{
                if(bracesCnt != 0){
                    resultArr[outIncr++] = '(';
                }
                bracesCnt++;
            }
        }
        return new String(resultArr).substring(0, outIncr);
    }
}
