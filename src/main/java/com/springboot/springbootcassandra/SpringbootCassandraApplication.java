package com.springboot.springbootcassandra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@SpringBootApplication
public class SpringbootCassandraApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCassandraApplication.class, args);
	}

}



