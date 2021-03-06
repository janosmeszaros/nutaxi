package com.msteam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.msteam.repositories.UserRepository;

@SpringBootApplication
public class SampleCassandraProjectApplication implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(SampleCassandraProjectApplication.class);

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SampleCassandraProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.findAll()
				.forEach(user -> LOGGER.info("{}", user));
	}

}
