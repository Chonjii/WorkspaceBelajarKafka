package hystrixtes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import hystrixtes.service.HystrixTesService;

@RestController
public class HystrixTesController {
	
	@Autowired
	HystrixTesService hystrixTesService;
	
	@RequestMapping(value="/meong/{value}", method=RequestMethod.GET, produces="application/json")
	public String getString(@PathVariable String value) {
		//sender.send(topic, value);
		
		return hystrixTesService.getNotif(value);
	}
}
