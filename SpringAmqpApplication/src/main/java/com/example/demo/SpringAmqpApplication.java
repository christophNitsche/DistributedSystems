package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/*
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;

import com.rabbitmq.client.ConnectionFactory;

import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
*/

@SpringBootApplication
@RestController
public class SpringAmqpApplication {

	@Autowired
	AMQPSender sender;
	
	@Autowired
	AMQPReceiver receiver;
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringAmqpApplication.class, args);
		
		/*
		CachingConnectionFactory cf = new CachingConnectionFactory();
		
		// set up the queue, exchange, binding on the broker
		RabbitAdmin admin = new RabbitAdmin(cf);
		Queue queue = new Queue("myQueue");
		admin.declareQueue(queue);
		TopicExchange exchange = new TopicExchange("myExchange");
		admin.declareExchange(exchange);
		admin.declareBinding(BindingBuilder.bind(queue).to(exchange).with("foo.*"));
		
		// set up the listener and container
		SimpleMessageListenerContainer container = new SimpleMessageListenerContainer(cf);
		Object listener = new Object() {public void handleMessage(String foo) { System.out.println(foo);}};
		MessageListenerAdapter adapter = new MessageListenerAdapter(listener);
		container.setMessageListener(adapter);
		container.setQueueNames("myQueue");
		container.start();
		
		// send something
		RabbitTemplate template = new RabbitTemplate(cf);
		template.convertAndSend("myExchange", "foo.bar", "Hello, World!");
		Thread.sleep(1000); container.stop();
		*/
	}
}
