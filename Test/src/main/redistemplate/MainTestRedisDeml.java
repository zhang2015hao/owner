package main.redistemplate;

import redis.clients.jedis.Jedis;

public class MainTestRedisDeml {

	public static void main(String[] args) {
		Jedis jedis = new Jedis("192.168.1.171");
		jedis.asking();
		
	}
}
