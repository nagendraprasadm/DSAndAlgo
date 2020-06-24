package org.nm.dsalgo.problems.others.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveOuterMostParanthesis1021Test
{
    private RemoveOuterMostParanthesis1021 inst = new RemoveOuterMostParanthesis1021();

    @Test
    public void testOne(){
        String result = removeParanthesis("(()())(())");
        assertEquals("()()()", result);
    }

    private String removeParanthesis(String input){
        return inst.removeOuterParentheses(input);
    }

}