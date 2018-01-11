package test.belajar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
public class NotifMain {
	public static void main(String[] args) {
		SpringApplication.run(NotifMain.class, args);//manggil diri sendiri untuk menditect anotation class nya
		String x = null;
	}
}