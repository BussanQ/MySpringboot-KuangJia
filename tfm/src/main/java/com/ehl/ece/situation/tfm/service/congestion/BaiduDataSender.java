package com.ehl.ece.situation.tfm.service.congestion;

import com.alibaba.fastjson.JSON;
import com.ehl.ece.situation.tfm.bean.Message;
import com.ehl.ece.situation.tfm.bean.RoadAlarm;
import com.ehl.ece.situation.tfm.bean.RoadRank;
import org.apache.log4j.Logger;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * @author lizh
 * @date 2017/10/27
 */
@Component
public class BaiduDataSender {
	static final Logger logger = Logger.getLogger(BaiduDataSender.class);
//	@Autowired
//	private KafkaTemplate kafkaTemplate;
	@Autowired
	BaiduDataApi baiduDataApi;
	@Autowired
	RabbitTemplate rabbitTemplate;
	/**
	 * 定时获取路段拥堵数据
	 * 发送数据到kafka
	 */
//	@Scheduled(fixedRate= 60 * 1000)
	public void sendMessage() throws Exception{
		Date now = new Date();
		Message message = new Message();
		message.setSendTime(now);
		List<RoadRank> list = baiduDataApi.getRoadRank();
		for(RoadRank roadRank : list){
			roadRank.setDateTime(now);
		}
		message.setList(list);
		List<RoadAlarm> alarmList = baiduDataApi.getRoadAlarm();
		message.setRoadAlarmList(alarmList);
//		kafkaTemplate.send("baidu_roadrank", JSON.toJSONString(message));

		//直接传入mq
		message.setInterval("1");
		String json = JSON.toJSONString(message);
		rabbitTemplate.convertAndSend("TfmExchange","Tfm.congest",json.getBytes());
		logger.info("发送百度拥堵数据");
	}
}
