package org.sbl.sblearning01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Sblearning01Application {

	public static void main(String[] args) {
		SpringApplication.run(Sblearning01Application.class, args);
		System.out.println("Hello Spring Boot app");
	}

}
