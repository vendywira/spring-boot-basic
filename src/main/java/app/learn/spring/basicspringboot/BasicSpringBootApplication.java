package app.learn.spring.basicspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BasicSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicSpringBootApplication.class, args);
	}

	@Autowired
	private Message message;

	@GetMapping("/")
	public String helloWorld() {
		return message.getMessage();
	}
}
