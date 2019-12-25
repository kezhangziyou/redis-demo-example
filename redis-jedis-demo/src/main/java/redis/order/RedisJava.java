package redis.order;

import redis.clients.jedis.Jedis;
import Constant.RedisUrlConstant;

/**
 * @author zhangke
 * @version 1.0
 * @className redisOrder.RedisJava
 * @description 连接到 redis 服务
 * @date 2019/12/16 4:42 PM
 **/
public class RedisJava {
	public static void main(String[] args) {
		//连接阿里云的 Redis 服务
		Jedis jedis = new Jedis(RedisUrlConstant.REDIS_URL);
		//此处为你设置的密码，如果开启了密码的话
		jedis.auth(RedisUrlConstant.REDIS_PASSWORD);
		System.out.println("连接成功");

		System.out.println(jedis.getClient().getPort());
		//查看服务是否运行
		System.out.println("服务正在运行: "+jedis.ping());

	}
}