package org.nm.dsalgo.distributed;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class SimpleConsistentHashingImplTest
{

    private static final Logger logger = LoggerFactory.getLogger(
        SimpleConsistentHashingImpl.class);

    @Test
    public void testPut ()
    {
        MapHolder nodeOne = new MapHolder(1);
        MapHolder nodeTwo = new MapHolder(2);
        MapHolder nodeThree = new MapHolder(3);
        List<MapHolder> nodes = new ArrayList<MapHolder>();
        nodes.add(nodeOne);
        nodes.add(nodeTwo);
        nodes.add(nodeThree);
        SimpleConsistentHashingImpl<MapHolder> inst = new SimpleConsistentHashingImpl<MapHolder>(
            nodes, 1);
        logger.info(inst.toString());

        String key = "asjakdajdskjabdkabdkab";
        MapHolder node = inst.getCacheNode(key);
        logger.debug(
            "Node Number for Key - {} with hasCode - {}, is- {}",
            key,
            key.hashCode(),
            node.getNodeNumber());
        node.put(key, "VALUE_" + key);
        key = "KJHFOHFIAHFO";
        node = inst.getCacheNode(key);
        logger.debug(
            "Node Number for Key - {} with hasCode - {}, is- {}",
            key,
            key.hashCode(),
            node.getNodeNumber());
        node.put(key, "VALUE_" + key);
        key = "2355435435345";
        node = inst.getCacheNode(key);
        logger.debug(
            "Node Number for Key - {} with hasCode - {}, is- {}",
            key,
            key.hashCode(),
            node.getNodeNumber());
        node.put(key, "VALUE_" + key);
        key = "2355435435345_(*&(*&(((^(hdkjhaskjhd_++_KJHDJKSHDJASH";
        node = inst.getCacheNode(key);
        logger.debug(
            "Node Number for Key - {} with hasCode - {}, is- {}",
            key,
            key.hashCode(),
            node.getNodeNumber());
        node.put(key, "VALUE_" + key);

    }

}