package com.ehl.ece.situation.tfm;

import com.ehl.ece.situation.tfm.service.congestion.BaiduDataApi;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAsync
public class Application implements CommandLineRunner{

	static final Logger logger = Logger.getLogger(Application.class);
	@Autowired
	BaiduDataApi baiduDataApi;

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {

		/*String roadAlarm = baiduDataApi.sendUnusualCongestionData();
		String r = baiduDataApi.getRoadRankStr();
		logger.info(roadAlarm);
		logger.info(r);*/
	}
}
