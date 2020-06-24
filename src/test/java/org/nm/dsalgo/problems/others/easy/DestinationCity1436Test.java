package org.nm.dsalgo.problems.others.easy;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DestinationCity1436Test
{
    private DestinationCity1436 inst = new DestinationCity1436();

    @Test
    public void testOne(){
        List<List<String>> paths = new ArrayList<List<String>>();
        List<String> one = new ArrayList<String>();
        one.add("London");
        one.add("NY");
        paths.add(one);
        one = new ArrayList<String>();
        one.add("NY");
        one.add("Lima");
        paths.add(one);
        one = new ArrayList<String>();
        one.add("Lima");
        one.add("San Polo");
        paths.add(one);
        String destCity = getDestination(paths);
        assertEquals("San Polo", destCity);

    }

    private String getDestination(List<List<String>> paths){
        return inst.destCity(paths);
    }

}