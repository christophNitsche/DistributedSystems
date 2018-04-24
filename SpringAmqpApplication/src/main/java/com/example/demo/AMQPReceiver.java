package com.example.demo;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

@RabbitListener(queues = "my-queue")
public class AMQPReceiver {
	
	@RabbitHandler
	public void receive(String in)
	{
		System.out.println("Received '" + in + "'");
		//messageList.add(in);
	}
}
