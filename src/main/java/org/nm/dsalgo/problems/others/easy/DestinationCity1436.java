package org.nm.dsalgo.problems.others.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DestinationCity1436
{
    // Set is faster than list
    public String destCity(List<List<String>> paths) {
        Set<String> starts = new HashSet<String>();
        for(int i=0 ;i < paths.size() ; i++){
            List<String> curList = paths.get(i);
            starts.add(curList.get(0));
        }
        for(int i=0 ;i < paths.size() ; i++){
            List<String> curList = paths.get(i);
            if(!starts.contains(curList.get(1))){
                return curList.get(1);
            }
        }
        return null;
    }
}
