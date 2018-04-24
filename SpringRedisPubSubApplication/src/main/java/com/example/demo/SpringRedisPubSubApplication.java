package com.example.demo;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.listener.ChannelTopic;
//import org.springframework.data.redis.listener.RedisMessageListenerContainer;
//import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;
//import org.springframework.data.redis.serializer.GenericToStringSerializer;
import org.springframework.web.bind.annotation.RestController;

//import com.example.demo.queue.RedisMessagePublisher;
//import com.example.demo.queue.RedisMessageSubscriber;

@SpringBootApplication
@RestController
public class SpringRedisPubSubApplication {

	//@Autowired
	//private RedisMessagePublisher redisMessagePublisher;
	
	//@Autowired
	//private RedisMessageSubscriber redisMessageSubscriber;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringRedisPubSubApplication.class, args);
	}
}
