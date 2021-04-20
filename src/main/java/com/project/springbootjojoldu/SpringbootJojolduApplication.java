package com.project.springbootjojoldu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringbootJojolduApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootJojolduApplication.class, args);
    }
}
