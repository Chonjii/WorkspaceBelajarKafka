package hystrixtes.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HystrixTesService {
	@HystrixCommand(fallbackMethod = "reliable")
    public String getNotif(String value) {
        return new RestTemplate()
          .getForObject("http://localhost:8989/service/kucing", 
          String.class, value);
    }
  
    public String reliable(String value) {
        return "Hello " + value + "!";
    }
}