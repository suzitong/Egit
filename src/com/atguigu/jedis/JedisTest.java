package com.atguigu.jedis;

import redis.clients.jedis.Jedis;

public class JedisTest {

	public static void main(String[] args) {
		Jedis jedis =new Jedis("192.168.192.100",6379);
		String ping = jedis.ping();
		System.out.println(ping);
		System.out.println("关朝阳到此一游");
		
	}

}
