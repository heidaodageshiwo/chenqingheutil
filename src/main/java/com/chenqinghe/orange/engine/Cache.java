package com.chenqinghe.orange.engine;

import com.chenqinghe.orange.node.SqlNode;

import java.util.concurrent.ConcurrentHashMap;


public class Cache {

    ConcurrentHashMap<String, SqlNode> nodeCache = new ConcurrentHashMap<>();

    public ConcurrentHashMap<String, SqlNode> getNodeCache() {
        return nodeCache;
    }
}
