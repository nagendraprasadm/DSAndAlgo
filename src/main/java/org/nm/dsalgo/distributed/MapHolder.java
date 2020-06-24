package org.nm.dsalgo.distributed;

import java.util.HashMap;
import java.util.Map;

public class MapHolder
{
    private int nodeNumber;

    private Map<String, String> cache;

    public MapHolder (int nodeNumber)
    {
        this.nodeNumber = nodeNumber;
        cache = new HashMap<String, String>();
    }

    public void put (String key, String value)
    {
        cache.put(key, value);
    }

    public String get (String key)
    {
        return cache.get(key);
    }

    public int getNodeNumber ()
    {
        return nodeNumber;
    }

    @Override
    public int hashCode ()
    {
        return Integer.toString(nodeNumber).hashCode();
    }
}
