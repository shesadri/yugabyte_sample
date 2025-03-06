package com.tgt.yugabyte.config;

import com.datastax.oss.driver.api.core.CqlSession;

import java.net.InetSocketAddress;

public class CassandraConfig {
    private static final String CONTACT_POINT = "127.0.0.1";
    private static final int PORT = 9042;
    private static final String KEYSPACE = "sample_cart";
    public static CqlSession getSession() {
        return CqlSession.builder()
                .addContactPoint(new InetSocketAddress(CONTACT_POINT, PORT))
                .withKeyspace(KEYSPACE)
                .withLocalDatacenter("datacenter1")
                .build();
    }
}
