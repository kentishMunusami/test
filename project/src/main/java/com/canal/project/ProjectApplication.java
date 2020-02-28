package com.canal.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication(scanBasePackages={
"com.canal.dao", "com.canal.service", "com.canal.controller", "com.canal.security"})
@EntityScan("com.canal.bean")
@EnableJpaRepositories(basePackages = {
	    "com.canal.dao"
	})
public class ProjectApplication {

	@Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
	
	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

}
