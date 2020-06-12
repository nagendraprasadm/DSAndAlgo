package org.nm.dsalgo.problems.others;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AnagramsInStringTest
{

    private AnagramsInString inst = new AnagramsInString();

    @Test
    public void testOne(){
        List<Integer> result = inst.findAnagrams("abc", "ab");
        assertEquals(1, result.size());
        assertTrue(0 == result.get(0));
    }

    @Test
    public void testTwo(){
        List<Integer> result = inst.findAnagrams("a", "a");
        assertEquals(1, result.size());
        assertTrue(0 == result.get(0));
    }

    @Test
    public void testThree(){
        List<Integer> result = inst.findAnagrams("abcab", "ab");
        assertEquals(2, result.size());
        assertTrue(0 == result.get(0));
        assertTrue(3 == result.get(1));
    }

    @Test
    public void testFour(){
        List<Integer> result = inst.findAnagrams("abac", "ab");
        assertEquals(2, result.size());
        assertTrue(0 == result.get(0));
        assertTrue(1 == result.get(1));
    }

    @Test
    public void testFive(){
        List<Integer> result = inst.findAnagrams("abab", "ab");
        assertEquals(3, result.size());
        assertTrue(0 == result.get(0));
        assertTrue(1 == result.get(1));
        assertTrue(2 == result.get(2));
    }

    @Test
    public void testSix(){
        List<Integer> result = inst.findAnagrams("aa", "bb");
        assertEquals(0, result.size());
    }

    @Test
    public void testSeven(){
        List<Integer> result = inst.findAnagrams("baa", "aa");
        assertEquals(1, result.size());
    }

    @Test
    public void testEight(){
        List<Integer> result = inst.solution2("abacbabc", "abc");
        assertEquals(4, result.size());
        assertTrue(1 == result.get(0));
        assertTrue(2 == result.get(1));
        assertTrue(3 == result.get(2));
        assertTrue(5 == result.get(3));
    }

    @Test
    public void testNine(){
        List<Integer> result = inst.solution2("cbadcbdabc", "abc");
        assertEquals(4, result.size());
        assertTrue(1 == result.get(0));
        assertTrue(2 == result.get(1));
        assertTrue(3 == result.get(2));
        assertTrue(5 == result.get(3));
    }
}