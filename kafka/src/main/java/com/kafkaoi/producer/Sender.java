package com.kafkaoi.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service("sender")
public class Sender {
	private static final Logger LOGGER = LoggerFactory.getLogger(Sender.class);
	
	@Autowired
	private KafkaTemplate<String,String> kafkaTemplate;
	
	public void send(String topic, String payLoad) {
		LOGGER.info("sending payload='{}' topic='{}'", payLoad, topic);
		kafkaTemplate.send(topic, payLoad);
	}
}
