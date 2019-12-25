package redis.order;

import redis.clients.jedis.Jedis;
import Constant.RedisUrlConstant;

import java.util.List;

/**
 * @author zhangke
 * @version 1.0
 * @className redisOrder.RedisListJava
 * @description Redis Java List(列表) 实例
 * @date 2019/12/16 4:44 PM
 **/
public class RedisListJava {
	public static void main(String[] args) {
		//连接阿里云的 Redis 服务
		Jedis jedis = new Jedis(RedisUrlConstant.REDIS_URL);
		//此处为你设置的密码，如果开启了密码的话
		jedis.auth(RedisUrlConstant.REDIS_PASSWORD);
		System.out.println("连接成功");
		//存储数据到列表中
		jedis.lpush("site-list", "Runoob");
		jedis.lpush("site-list", "Google");
		jedis.lpush("site-list", "Taobao");
		// 获取存储的数据并输出
		List<String> list = jedis.lrange("site-list", 0 ,2);
		for(int i=0; i<list.size(); i++) {
			System.out.println("列表项为: "+list.get(i));
		}
	}
}