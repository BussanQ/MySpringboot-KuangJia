package com.ehl.ece.situation.tfm.service.congestion;

import com.alibaba.fastjson.JSON;
import com.ehl.ece.situation.tfm.bean.TrafficManageindex;
import org.apache.log4j.Logger;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;

/**
 * @author lizh
 * @date 2017/11/3
 */
@Service
public class IndexSender {
	static final Logger logger = Logger.getLogger(IndexSender.class);

	@Autowired
	AmqpTemplate rabbitTemplate;

	private HashMap<String,TrafficManageindex> lastDay
			= new HashMap<>();

//	@Scheduled(fixedDelay= 60 * 1000)
	@Async
	public void start() throws Exception{
		Random r = new Random((new Date()).getTime());
		DecimalFormat df =new DecimalFormat("#.00");
		double manage =  Math.floor(r.nextDouble() * 20 * 100) / 100;
		double index_1 = Math.floor(r.nextDouble() * 10 * 100) / 100;
		TrafficManageindex trafficManageindex = new TrafficManageindex();
		trafficManageindex.setDatetime(new Date());
		trafficManageindex.setIndex_1(index_1);
		trafficManageindex.setManageindex(manage);
		rabbitTemplate.convertAndSend("TOPIC_COMPOSITE_MANAGEINDEX_T", "",JSON.toJSONString(trafficManageindex).getBytes());
	}
}
