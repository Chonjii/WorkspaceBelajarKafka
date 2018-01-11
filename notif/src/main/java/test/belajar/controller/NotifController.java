package test.belajar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import test.belajar.producer.Sender;

@RestController
public class NotifController {
	
	@Autowired
	private Sender sender;

	@Value("${kafka.topic}")
	private String topic;
	
	@RequestMapping(value="/service/{value}", method=RequestMethod.GET, produces="application/json")
	public String getString(@PathVariable String value) {
		//sender.send(topic, value);
		
		return value;
	}
}
