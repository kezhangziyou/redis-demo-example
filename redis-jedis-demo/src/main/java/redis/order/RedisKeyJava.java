package redis.order;

import redis.clients.jedis.Jedis;
import Constant.RedisUrlConstant;

import java.util.Iterator;
import java.util.Set;

/**
 * @author zhangke
 * @version 1.0
 * @className redisOrder.RedisKeyJava
 * @description Redis Java Keys 实例
 * @date 2019/12/16 4:45 PM
 **/
public class RedisKeyJava {
	public static void main(String[] args) {
		//连接阿里云的 Redis 服务
		Jedis jedis = new Jedis(RedisUrlConstant.REDIS_URL);
		//此处为你设置的密码，如果开启了密码的话
		jedis.auth(RedisUrlConstant.REDIS_PASSWORD);
		System.out.println("连接成功");

		// 获取数据并输出
		Set<String> keys = jedis.keys("*");
		Iterator<String> it=keys.iterator() ;
		while(it.hasNext()){
			String key = it.next();
			System.out.println(key);
		}
	}
}