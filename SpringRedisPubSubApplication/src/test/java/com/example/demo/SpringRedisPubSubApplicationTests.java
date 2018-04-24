package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.queue.RedisMessagePublisher;

//@RunWith(SpringRunner.class)
@SpringBootApplication
@RestController
public class SpringRedisPubSubApplicationTests {

	@Autowired
	private RedisMessagePublisher redisMessagePublisher;
	
	@Autowired
	private RedisMessagePublisher redisMessageSubscriber;
	
	@Test
	public void contextLoads() {
	}

}
