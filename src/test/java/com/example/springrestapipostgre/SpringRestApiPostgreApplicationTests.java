package com.example.springrestapipostgre;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import redis.clients.jedis.Connection;
import redis.clients.jedis.Jedis;

@SpringBootTest
class SpringRestApiPostgreApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
		public static void main(String[] args) {
			Jedis jedis = new Jedis("redis://default:0boc9QZMhax6FUrjGcQBctsVeL6xHkb1@redis-12001.c1.ap-southeast-1-1.ec2.cloud.redislabs.com:12001");
			Connection connection = jedis.getConnection();
		}

}
