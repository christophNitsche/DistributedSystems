package com.example.demo;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class AMQPSender {

	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	@Autowired
	private Queue queue;
	
	public void send(String message)
	{
		this.rabbitTemplate.convertAndSend(queue.getName(), message);
		System.out.println(" [x] Sent '" + message + "'");
	}
}
