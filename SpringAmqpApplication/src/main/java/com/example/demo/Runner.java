/*package com.example.demo;

import java.util.concurrent.TimeUnit;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@Component
public class Runner implements CommandLineRunner{
	
	private final RabbitTemplate rabbitTemplate;
	private final AMQPReceiver receiver;
	
	public Runner(AMQPReceiver receiver, RabbitTemplate rabbitTemplate)
	{
		this.receiver = receiver;
		this.rabbitTemplate = rabbitTemplate;
	}
	
	@Override
	public void run(String... args) throws Exception
	{
		System.out.print("Sending message...");
		rabbitTemplate.convertAndSend(Application.topicExchangeName, "foo.bar.baz", "Hello from RabbitMQ!");
	}
}
*/