package br.com.teste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TesteEmailApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteEmailApplication.class, args);
	}

}
