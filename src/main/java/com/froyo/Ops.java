package com.froyo;

import org.apache.curator.framework.CuratorFramework;

public class Ops {
    
    public static void create(CuratorFramework client, String path, byte[] payload) throws Exception {
        
        client.create().forPath(path, payload);
    }

    public static void setData(CuratorFramework client, String path, byte[] payload) throws Exception {
        
        client.setData().forPath(path, payload);
    }
}
