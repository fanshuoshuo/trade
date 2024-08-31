package com.leopard.trade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class StockVisualizationApplication {

	public static void main(String[] args) {

		System.out.print("Hello");
		SpringApplication.run(StockVisualizationApplication.class, args);
	}

}
