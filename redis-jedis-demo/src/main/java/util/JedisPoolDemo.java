package util;

import redis.clients.jedis.Jedis;

/**
 * @author zhangke
 * @version 1.0
 * @className demo
 * @description
 * @date 2019/12/25 5:58 PM
 **/
public class JedisPoolDemo {
	public static  void main(String [] args){
		Jedis jedis = RedisClient.getJedis();
		System.out.println("连接成功");
		//设置 redis 字符串数据
		jedis.set("runoobkey1", "www.runoob.com");
		// 获取存储的数据并输出
		System.out.println("redis 存储的字符串为: "+ jedis.get("runoobkey1"));
	}
}