package org.nm.dsalgo.problems.others.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ToLowerCase709Test
{

    private ToLowerCase709 inst = new ToLowerCase709();

    @Test
    public void testOne(){
        String output = toLowerCase("HEllo");
        assertEquals("hello", output);
    }

    private String toLowerCase(String input){
        return inst.toLowerCase(input);
    }

}