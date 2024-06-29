package com.patrick.stockwatcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class StockwatcherApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockwatcherApplication.class, args);
	}

}
