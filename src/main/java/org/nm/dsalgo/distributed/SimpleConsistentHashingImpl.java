package org.nm.dsalgo.distributed;

import java.util.*;

public class SimpleConsistentHashingImpl<T> implements ConsistentHashing<T>
{

    private int noOfReplicas;

    private SortedMap<Integer, T> circle = new TreeMap<Integer, T>();


    public SimpleConsistentHashingImpl (List<T> noOfNodes, int noOfReplicas)
    {
        this.noOfReplicas = noOfReplicas;
        for (int i = 0; i < noOfNodes.size(); i++) {
            addNode(noOfNodes.get(i));
        }
    }

    @Override
    public T getCacheNode (String key)
    {
        int hash = key.hashCode();
        if (!circle.containsKey(hash)) {
            SortedMap<Integer, T> tailMap = circle.tailMap(hash);
            hash = tailMap.isEmpty() ? circle.firstKey() : tailMap.firstKey();
        }
        return circle.get(hash);
    }

    @Override
    public void addNode (T nodeNumber)
    {
        int curHash = nodeNumber.hashCode();
        circle.put(curHash, nodeNumber);

    }

    @Override
    public String toString ()
    {
        return "SimpleConsistentHashingImpl{" + "noOfReplicas=" + noOfReplicas + ", circle="
            + circle + '}';
    }

    @Override
    public void removeNode (T nodeNumber)
    {
        int curHash = nodeNumber.hashCode();
        circle.remove(curHash);
    }
}
