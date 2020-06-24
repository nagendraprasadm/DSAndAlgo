package org.nm.dsalgo.distributed;

import java.util.Map;

public interface ConsistentHashing<T>
{
    public T getCacheNode(String key);

    public void addNode(T node);

    public void removeNode(T node);
}
