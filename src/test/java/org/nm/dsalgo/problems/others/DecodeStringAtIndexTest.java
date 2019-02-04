package org.nm.dsalgo.problems.others;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DecodeStringAtIndexTest {

	private static final Logger logger = LoggerFactory.getLogger(DecodeStringAtIndexTest.class);

	private static DecodeStringAtIndex inst;

	@Rule
	public TestName testName = new TestName();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		inst = new DecodeStringAtIndex();
	}

	@Test
	public void testOne() {
		String inputStr = "ab";
		int k = 1;
		String result = inst.decodeAtIndex(inputStr, k);
		assertEquals("a", result);
	}

	@Test
	public void testTwo() {
		String inputStr = "ab";
		int k = 2;
		String result = inst.decodeAtIndex(inputStr, k);
		assertEquals("b", result);
	}

	@Test
	public void testThree() {
		String inputStr = "a2b2";
		int k = 2;
		String result = inst.decodeAtIndex(inputStr, k);
		assertEquals("a", result);
	}

	@Test
	public void testFour() {
		String inputStr = "a2b2";
		int k = 3;
		String result = inst.decodeAtIndex(inputStr, k);
		assertEquals("b", result);
	}

	@Test
	public void testFive() {
		String inputStr = "a2b2";
		int k = 4;
		String result = inst.decodeAtIndex(inputStr, k);
		assertEquals("a", result);
	}

	@Test
	public void testSix() {
		String inputStr = "leet2code3";
		int k = 10;
		String result = inst.decodeAtIndex(inputStr, k);
		assertEquals("o", result);
	}

	@Test
	public void testSeven() {
		String inputStr = "sun2rises4in3the8east10";
		String decodeStr = inst.getDecodedString(inputStr);
		int k = 200;
		logger.debug("[{}] decodeString is - [{}] character at index [{}] is [{}]",
				new Object[] { testName.getMethodName(), decodeStr, k, decodeStr.charAt(k - 1) });
		String result = inst.decodeAtIndex(inputStr, k);
		assertEquals(new String(new char[] { decodeStr.charAt(k - 1) }), result);
	}

	@Test
	public void testEight() {
		String inputStr = "east2or3west4india5is6the7best8f";
		String decodeStr = inst.getDecodedString(inputStr);
		int k = 311;
		logger.debug("[{}] decodeString is - [{}] character at index [{}] is [{}]",
				new Object[] { testName.getMethodName(), decodeStr, k, decodeStr.charAt(k - 1) });
		String result = inst.decodeAtIndex(inputStr, k);
		assertEquals(new String(new char[] { decodeStr.charAt(k - 1) }), result);
	}

	@Test
	public void testNine() {
		String inputStr = "a23";
		String decodeStr = inst.getDecodedString(inputStr);
		int k = 6;
		logger.debug("[{}] decodeString is - [{}] character at index [{}] is [{}]",
				new Object[] { testName.getMethodName(), decodeStr, k, decodeStr.charAt(k - 1) });
		String result = inst.decodeAtIndex(inputStr, k);
		assertEquals(new String(new char[] { decodeStr.charAt(k - 1) }), result);
	}

	@Test
	public void testTen() {
		String inputStr = "east234or345";
		String decodeStr = inst.getDecodedString(inputStr);
		int k = 57;
		logger.debug("[{}] decodeString is - [{}] character at index [{}] is [{}]",
				new Object[] { testName.getMethodName(), decodeStr, k, decodeStr.charAt(k - 1) });
		String result = inst.decodeAtIndex(inputStr, k);
		assertEquals(new String(new char[] { decodeStr.charAt(k - 1) }), result);
	}

	@Test
	public void testEleven() {
		String inputStr = "m26559vishxq9b726mrj";
		String decodeStr = inst.getDecodedString(inputStr);
		int k = 2022213;
		logger.debug("[{}] decodeString is - [{}] character at index [{}] is [{}]",
				new Object[] { testName.getMethodName(), decodeStr, k, decodeStr.charAt(k - 1) });
		String result = inst.decodeAtIndex(inputStr, k);
		assertEquals(new String(new char[] { decodeStr.charAt(k - 1) }), result);
	}

	@Test
	public void testTwelve() {
		String inputStr = "m26559vishxq9b726mrj";
		String decodeStr = inst.getDecodedString(inputStr);
		int k = 2045814;
		logger.debug("[{}] decodeString is - [{}] character at index [{}] is [{}]",
				new Object[] { testName.getMethodName(), decodeStr, k, decodeStr.charAt(k - 1) });
		String result = inst.decodeAtIndex(inputStr, k);
		assertEquals(new String(new char[] { decodeStr.charAt(k - 1) }), result);
	}

	@Test
	public void testThirteen() {
		String inputStr = "ajx37nyx97niysdrzice4petvcvmcgqn282zicpbx6okybw93vhk782unctdbgmcjmbqn25rorktmu5ig2qn2y4xagtru2nehmsp";
//		String decodeStr = inst.getDecodedString(inputStr);
		int k = 976159153;
//		logger.debug("[{}] decodeString is - [{}] character at index [{}] is [{}]",
//				new Object[] { testName.getMethodName(), decodeStr, k, decodeStr.charAt(k - 1) });
		String result = inst.decodeAtIndex(inputStr, k);
		assertEquals("a", result);
	}
	
	@Test
	public void testFourteen() {
		String inputStr = "a2b3c4";
		String decodeStr = inst.getDecodedString(inputStr);
		int k = 40;
		logger.debug("[{}] decodeString is - [{}] character at index [{}] is [{}]",
				new Object[] { testName.getMethodName(), decodeStr, k, decodeStr.charAt(k - 1) });
		String result = inst.decodeAtIndex(inputStr, k);
		assertEquals(new String(new char[] { decodeStr.charAt(k - 1) }), result);
	}
}
