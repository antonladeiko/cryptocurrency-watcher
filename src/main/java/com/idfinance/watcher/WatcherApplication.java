package com.idfinance.watcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class WatcherApplication {
	public static void main(String[] args) {
		SpringApplication.run(WatcherApplication.class, args);
	}
}
