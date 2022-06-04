package com.trilogyed.gamestore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GameStoreInvoicingApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameStoreInvoicingApplication.class, args);
	}

}
