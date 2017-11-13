package com.ehl.ece.situation.tfm.service.equipment;

import com.alibaba.fastjson.JSON;
import com.ehl.ece.situation.tfm.bean.EquipmentRunstate;
import com.ehl.ece.situation.tfm.publicMapper.EquipmentMapper;
import org.apache.log4j.Logger;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 设备运行状态推送
 * @author lizh
 * @date 2017/11/8
 */
@Service
public class EquipmentSender {
	static final Logger logger = Logger.getLogger(EquipmentSender.class);

	@Autowired
	AmqpTemplate rabbitTemplate;

	@Autowired
	EquipmentMapper equipmentMapper;

	@Scheduled(fixedDelay= 60 * 1000)
	@Async
	public void start(){
		try {
			List<EquipmentRunstate> list = equipmentMapper.findAll();
			String json = JSON.toJSONString(list);
			rabbitTemplate.convertAndSend("TOPIC_PUBLIC_EQUIPMENTSTATUS_T", "", json.getBytes());
			logger.info("发送设备状态数据");
		}
		catch (Exception ex){
			logger.error("获取设备运行状态出错",ex);
		}
	}
}
