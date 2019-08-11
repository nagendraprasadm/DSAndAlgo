package org.nm.dsalgo.problems.others.easy;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class JewelsAndStonesTest
{

    private static JewelsAndStones inst;

    @BeforeClass
    public static void setupClass(){
        inst = new JewelsAndStones();
    }

    @Test
    public void simpleTest(){
        int count = inst.numJewelsInStones(new String("a"), new String("aBC"));
        assertEquals(1,count);
    }

    @Test
    public void simpleCharInBetween(){
        int count = inst.numJewelsInStones(new String("a"), new String("BaC"));
        assertEquals(1,count);
    }

    @Test
    public void BalnkInput(){
        int count = inst.numJewelsInStones(new String("a"), new String(""));
        assertEquals(0,count);
    }

    @Test
    public void simpleBlankJewels(){
        int count = inst.numJewelsInStones(new String(""), new String("BaC"));
        assertEquals(0,count);
    }

    @Test
    public void simpleSimpleRepertition(){
        int count = inst.numJewelsInStones(new String("a"), new String("BaaaaC"));
        assertEquals(4,count);
    }

    @Test
    public void simpleSimpleMultiJewel(){
        int count = inst.numJewelsInStones(new String("aA"), new String("BaaaaCA"));
        assertEquals(5,count);
    }

    @Test
    public void simpleSimpleMatchingJewelEnd(){
        int count = inst.numJewelsInStones(new String("bce"), new String("eea"));
        assertEquals(2,count);
    }

    @Test
    public void simpleMatchingJewelFrontMiddleEnd(){
        int count = inst.numJewelsInStones(new String("abAcz"), new String("aabbcdzzjjjAAkk"));
        assertEquals(9,count);
    }

    @Test
    public void simpleMatchingJewelFrontMiddleEnd2(){
        int count = inst.numJewelsInStones(new String("abAcz"), new String("aaooiidzzjjjAAkk"));
        assertEquals(6,count);
    }
}