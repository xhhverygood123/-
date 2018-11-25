package com.fh.util.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisPol {
    private static JedisPool pool;

    private static  JedisPool xiaohuihui(){
        JedisPoolConfig config=new JedisPoolConfig();
        config.setMaxTotal(1000);
        config.setMaxIdle(100);
        config.setMinIdle(100);
        config.setTestOnBorrow(true);
        config.setTestOnReturn(true);

         pool = new JedisPool(config,"192.168.1.64",6379);
        return  pool;
    }

    static {
        xiaohuihui();
    }

    public static Jedis getResouse(){
        return  pool.getResource();
    }



}

