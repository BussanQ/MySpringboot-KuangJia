package com.bussnaq.group.alpha;

import org.apache.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableScheduling
//@MapperScan(basePackages = "com.bussanq.group.alpha.mapper")
public class Application implements CommandLineRunner{

	static final Logger logger = Logger.getLogger(Application.class);

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {

	}
}
