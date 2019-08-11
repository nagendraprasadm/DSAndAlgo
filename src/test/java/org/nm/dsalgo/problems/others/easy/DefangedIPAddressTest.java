package org.nm.dsalgo.problems.others.easy;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class DefangedIPAddressTest
{
    private static DefangedIPAddress inst;

    @BeforeClass
    public static void setupBeforeClass ()
    {
        inst = new DefangedIPAddress();
    }

    @Test
    public void simpleTest ()
    {
        String defanged = inst.defangIPaddr("1.1.1.1");
        assertEquals("IP Addresss Didnt match.", "1[.]1[.]1[.]1", defanged);
    }

}