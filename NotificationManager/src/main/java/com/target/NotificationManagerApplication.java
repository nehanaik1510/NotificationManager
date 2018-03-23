package com.target;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Neha D Naik
 *
 */


@SpringBootApplication(scanBasePackages={
		"com.target"})
public class NotificationManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationManagerApplication.class, args);
	}
}
