package com.froyo;

import com.google.common.base.Charsets;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.utils.CloseableUtils;

public class Main {

    public Main() {
    }

    public static void main(String[] args) throws Exception {

        Main main = new Main();

        CuratorFramework client = ConfigServer.getClient("localhost:2181");
        String locatorEndpoint = "locator:5000";
        byte[] data = locatorEndpoint.getBytes(Charsets.UTF_8);
        client.create().forPath("/froyo/test", data);

    }
}