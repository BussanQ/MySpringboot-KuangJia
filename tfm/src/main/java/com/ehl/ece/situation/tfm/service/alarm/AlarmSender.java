package com.ehl.ece.situation.tfm.service.alarm;

import com.alibaba.fastjson.JSON;
import com.ehl.ece.situation.tfm.bean.AlarmInfo;
import com.ehl.ece.situation.tfm.mapper.AlarmInfoMapper;
import org.apache.log4j.Logger;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * 警情数据推送
 * @author lizh
 * @date 2017/10/18
 */
@Service
public class AlarmSender {
	static final Logger logger = Logger.getLogger(AlarmSender.class);

	@Autowired
	AmqpTemplate rabbitTemplate;

	@Autowired
	AlarmInfoMapper alarmInfoMapper;

	private static int i=0;
	private static String time;
	private List<AlarmInfo> alarmInfos;
	private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	@Scheduled(fixedDelay= 60 * 1000)
	@Async
	public void start() throws Exception{

		/*SimpleDateFormat firstFormat = new SimpleDateFormat("yyyy-MM-dd 03:00:00");
		if(time == null)
			time = firstFormat.format(new Date());
		List<AlarmInfo> alarmInfos = alarmInfoMapper.findBytime(time);
		if (alarmInfos == null)
			return;
		for(AlarmInfo alarmInfo : alarmInfos) {
			if (alarmInfo.getEventlevel() != null) {
				String level = alarmInfo.getEventlevel();
				switch (level) {
					case "1":
						alarmInfo.setEventleveldesc("一级");
						break;
					case "2":
						alarmInfo.setEventleveldesc("二级");
						break;
					case "3":
						alarmInfo.setEventleveldesc("三级");
						break;
					case "4":
						alarmInfo.setEventleveldesc("四级");
						break;
				}
			}
			if (alarmInfo.getEventstate() != null) {
				String state = alarmInfo.getEventstate();
				switch (state) {
					case "1":
						alarmInfo.setEventstatedesc("已接警");
						break;
					case "20":
					case "21":
					case "22":
						alarmInfo.setEventstatedesc("已派警");
						break;
					case "3":
						alarmInfo.setEventstatedesc("已到警");
						break;
					case "4":
						alarmInfo.setEventstatedesc("已处结");
						break;
					case "5":
						alarmInfo.setEventstatedesc("退单");
						break;
				}
			}
			alarmInfo.setAlarmid(UUID.randomUUID().toString());
			String json = FastJsonUtils.getJsonString(alarmInfo);
			rabbitTemplate.convertAndSend("AlarmExchange", "Alarm.a", json.getBytes());
			if(alarmInfo.getAlarmtime().getTime()>dateFormat.parse(time).getTime())
				time = dateFormat.format(alarmInfo.getAlarmtime());
		}*/
		if(alarmInfos == null) {
			try{
				alarmInfos = alarmInfoMapper.findAll();
			}
			catch (Exception ex){
				logger.error("sql",ex);
			}
		}
//			alarmInfos = alarmInfoMapper.selectList(new EntityWrapper<AlarmInfo>());
		else {
			if (i < alarmInfos.size()) {
				AlarmInfo alarmInfo = alarmInfos.get(i);
				if (alarmInfo.getEventlevel() != null) {
					String level = alarmInfo.getEventlevel();
					switch (level) {
						case "1":
							alarmInfo.setEventleveldesc("一级");
							break;
						case "2":
							alarmInfo.setEventleveldesc("二级");
							break;
						case "3":
							alarmInfo.setEventleveldesc("三级");
							break;
						case "4":
							alarmInfo.setEventleveldesc("四级");
							break;
					}
				}
				if (alarmInfo.getEventstate() != null) {
					String state = alarmInfo.getEventstate();
					switch (state) {
						case "1":
							alarmInfo.setEventstatedesc("已接警");
							break;
						case "20":
						case "21":
						case "22":
							alarmInfo.setEventstatedesc("已派警");
							break;
						case "3":
							alarmInfo.setEventstatedesc("已到警");
							break;
						case "4":
							alarmInfo.setEventstatedesc("已处结");
							break;
						case "5":
							alarmInfo.setEventstatedesc("退单");
							break;
					}
				}
				alarmInfo.setAlarmtime(new Date());
				alarmInfo.setAlarmid(UUID.randomUUID().toString());
				String json = JSON.toJSONString(alarmInfo);
				rabbitTemplate.convertAndSend("AlarmExchange", "Alarm.a", json.getBytes());
			}
			logger.info("logger.info(\"发送警情数据\");" + i);
			i++;
		}
	}
}
