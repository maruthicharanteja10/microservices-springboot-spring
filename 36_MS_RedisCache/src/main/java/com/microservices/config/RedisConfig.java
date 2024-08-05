package com.microservices.config;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.microservices.model.Country;

@Configuration
public class RedisConfig {
	
	@Bean
	JedisConnectionFactory jedisConnectionFactory() {
		JedisConnectionFactory jcf = new JedisConnectionFactory();
		//jcf.setHostName(hostName);
		//jcf.setPassword(password);
		//jcf.setPort(port);
		return jcf;
	}
	
	@Bean
	RedisTemplate<String, Country> redisTemplate() {
		RedisTemplate<String, Country> redisTemplate = new RedisTemplate<>();
		redisTemplate.setConnectionFactory(jedisConnectionFactory());
		return redisTemplate;
	}
	

	
}
