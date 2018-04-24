package com.example.demo;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AMQPConfig {

	@Bean
	public Queue hello()
	{
		return new Queue("my-queue");
	}
	
	@Bean
	public AMQPReceiver receiver()
	{
		return new AMQPReceiver();
	}
	
	@Bean
	public AMQPSender sender()
	{
		return new AMQPSender();
	}
}
