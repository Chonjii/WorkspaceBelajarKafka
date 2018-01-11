package com.kafkaoi.consumer;

import java.util.concurrent.CountDownLatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service("receiver")
public class Receiver {
	private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);
	
	private CountDownLatch latch = new CountDownLatch(1);
	
	public CountDownLatch getLach() {
		return latch;
	}
	
	@KafkaListener(topics = "${kafka.topic.helloworld}")
	public void receive(String payload) {
		LOGGER.info("received payload='{}'", payload);
		latch.countDown();
	}
}
