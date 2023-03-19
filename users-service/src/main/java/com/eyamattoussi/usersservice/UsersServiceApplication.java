package com.eyamattoussi.usersservice;

import com.eyamattoussi.usersservice.mapper.UsersMapperImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UsersServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsersServiceApplication.class, args);
	}

	@Bean
	UsersMapperImpl UsersMapperImpl(){
		return new UsersMapperImpl();
	}
}
