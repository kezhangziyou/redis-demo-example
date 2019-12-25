package redis.order;

import redis.clients.jedis.Jedis;
import Constant.RedisUrlConstant;

/**
 * @author zhangke
 * @version 1.0
 * @className redisOrder.RedisStringJava
 * @description Redis Java String(字符串) 实例
 * @date 2019/12/16 4:44 PM
 **/
public class RedisStringJava {
	public static void main(String[] args) {
		//连接阿里云的 Redis 服务
		Jedis jedis = new Jedis(RedisUrlConstant.REDIS_URL);
		//此处为你设置的密码，如果开启了密码的话
		jedis.auth(RedisUrlConstant.REDIS_PASSWORD);

		System.out.println("连接成功");
		//设置 redis 字符串数据
		jedis.set("runoobkey", "www.runoob.com");
		// 获取存储的数据并输出
		System.out.println("redis 存储的字符串为: "+ jedis.get("runoobkey"));
	}
}