package com.ehl.ece.situation.tfm.service.congestion;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * @test
 * @author lizh
 * @date 2017/10/27
 */
@Component
public class BaiduDataReceiver {
	static final Logger logger = Logger.getLogger(BaiduDataReceiver.class);

//	@KafkaListener(topics = "baidu_unusualcongestion")
	public void processMessage(String content) {
		logger.info(content);
	}

//	@KafkaListener(topics = "baidu_roadrank")
	public void get(String content) {
		logger.info(content);
	}
}