package org.nm.dsalgo.problems.others.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecryptStringsFromIntegerMap1309Test
{

    private DecryptStringsFromIntegerMap1309 inst = new DecryptStringsFromIntegerMap1309();

    @Test
    public void testOne(){
        String result = getDecryptedStr("10#11#12");
        assertEquals("jkab", result);
    }

    private String getDecryptedStr(String input){
        return inst.freqAlphabets(input);
    }

}