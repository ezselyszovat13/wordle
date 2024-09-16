package web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "persistence")
@EntityScan(basePackages = "persistence")
@ComponentScan(basePackages = {"persistence","service","web","config"})
public class WordleApplication {
	public static void main(String[] args) {
		SpringApplication.run(WordleApplication.class, args);
	}
}
