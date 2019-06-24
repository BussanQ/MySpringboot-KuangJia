package com.bussanq.group.alpha;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
//@MapperScan(basePackages = "com.bussanq.group.alpha.mapper")
public class Application implements CommandLineRunner{

	Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... strings) {
		logger.info("初始化完成");
	}
}
