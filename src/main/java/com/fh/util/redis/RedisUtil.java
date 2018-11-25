package com.fh.util.redis;

import redis.clients.jedis.Jedis;

public class RedisUtil {
    public  static  void  set(String key,String value){
        Jedis jedis=null;
        try {
             jedis = RedisPol.getResouse();
            jedis.set(key,value);
        } finally {
            if (null!= jedis){
                jedis.close();
                jedis=null;
            }
        }
    }
    public  static  void  expire(String key,int i){
        Jedis jedis=null;
        try {
            jedis = RedisPol.getResouse();
            jedis.expire(key,i);
        } finally {
            if (null!= jedis){
                jedis.close();
                jedis=null;
            }
        }
    }
    public  static  String get(String key){
        Jedis jedis=null;
        String result="";
        try {
            jedis = RedisPol.getResouse();
             result = jedis.get(key);
        } finally {
            if (null!= jedis){
                jedis.close();
                jedis=null;
            }
        }
        return  result;
    }

    public  static  boolean  setNx(String key,String  value ,int expire){
        Jedis jedis=null;
        try {
            jedis = RedisPol.getResouse();
            Long setnx = jedis.setnx(key, value);
            if (setnx==1){
                jedis.expire(key,expire);
                return true;
            }else {
                return false;
            }
        } finally {
            if (null!= jedis){
                jedis.close();
                jedis=null;
            }
        }
    }


    public  static  long incrExpire(String ker,int expire){
        Jedis jedis=null;
        try {
            jedis = RedisPol.getResouse();
            Long incr = jedis.incr(ker);
            if (incr==1){
                jedis.expire(ker,expire);
                return  incr;
            }else {
                return incr;
            }
        } finally {
            if (null!= jedis){
                jedis.close();
                jedis=null;
            }
        }
    }
    public static void main(String[] args) {
        //set("xiaouihui","xiaowugui");
        String xiaouihui = get("xiaouihui");
        System.out.println(xiaouihui);
    }
}
