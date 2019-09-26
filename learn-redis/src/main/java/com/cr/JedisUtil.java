package com.cr;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisUtil {

    private static JedisPool pool;

    static {
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(5);
        config.setMaxIdle(1);
        pool = new JedisPool(config, "host");
    }

    public static Jedis getJedis() {
        Jedis jedis = pool.getResource();
        jedis.auth("password");
        return jedis;
    }

    public static void close(Jedis jedis) {
        jedis.close();
    }

}
