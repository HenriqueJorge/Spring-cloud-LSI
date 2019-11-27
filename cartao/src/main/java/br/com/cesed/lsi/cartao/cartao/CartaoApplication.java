package br.com.cesed.lsi.cartao.cartao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CartaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartaoApplication.class, args);
	}

}
