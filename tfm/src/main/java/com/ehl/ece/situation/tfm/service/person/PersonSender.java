package com.ehl.ece.situation.tfm.service.person;

import com.alibaba.fastjson.JSON;
import com.ehl.ece.situation.tfm.bean.Person;
import com.ehl.ece.situation.tfm.bean.Plan;
import com.ehl.ece.situation.tfm.bean.PlanUser;
import com.ehl.ece.situation.tfm.mapper.PersonMapper;
import org.apache.log4j.Logger;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 警力数据推送
 * @author lizh
 * @date 2017/10/18
 */
@Service
public class PersonSender {
	static final Logger logger = Logger.getLogger(PersonSender.class);

	@Autowired
	AmqpTemplate rabbitTemplate;

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	PersonMapper personMapper;

	private int i=0;
	private int j=0;
	private int k=0;

	private List<Person> personList;
	private List<Plan> planList;
	private List<PlanUser> planUserList;

	private void initial(){
		personList = personMapper.findAll();
		String sql = "select * from t_service_plan";
		planList = jdbcTemplate.query(sql, new Object[] {},
				new BeanPropertyRowMapper<>(Plan.class));
		sql = "select * from t_service_plan_users";
		planUserList = jdbcTemplate.query(sql, new Object[] {},
				new BeanPropertyRowMapper<>(PlanUser.class));
	}

//	@Scheduled(fixedDelay= 60 * 1000)
	@Async
	public void start(){
		if(personList!=null) {
			if (i < personList.size()) {
				Person person = convert(personList.get(i));
				String json = JSON.toJSONString(person);
				rabbitTemplate.convertAndSend("PersonExchange", "Person.person", json.getBytes());
				i++;
			}
			else i=0;
			if (j < planList.size()) {
				Plan plan = planList.get(j);
				String json = JSON.toJSONString(plan);
				rabbitTemplate.convertAndSend("PersonExchange", "Person.plan", json.getBytes());
				j++;
			}
			else j=0;
			if (k < planUserList.size()) {
				PlanUser planUser = planUserList.get(k);
				String json = JSON.toJSONString(planUser);
				rabbitTemplate.convertAndSend("PersonExchange", "Person.planuser", json.getBytes());
				k++;
			}
			else k=0;
			logger.info("发送警力数据定时任务:" + i);
		}
		else
			initial();
	}

	private Person convert(Person person){
		if(person.getDutystate()!=null) {
			switch (person.getDutystate()) {
				default:
				case "0":
					person.setDutystatedesc("在岗");
					break;
				case "1":
					person.setDutystatedesc("脱岗");
					break;
				case "2":
					person.setDutystatedesc("离线");
					break;
				case "-1":
					person.setDutystatedesc("不当班");
					break;
				case "3":
					person.setDutystatedesc("无定位设备");
					break;
			}
		}
		if(person.getPdastate()!=null) {
			switch (person.getPdastate()) {
				default:
				case "1":
					person.setPdastatedesc("上岗");
					break;
				case "2":
					person.setDutystatedesc("下岗");
					break;
				case "3":
					person.setDutystatedesc("巡逻");
					break;
				case "4":
					person.setDutystatedesc("结束巡逻");
					break;
				case "5":
					person.setDutystatedesc("处理事故");
					break;
			}
		}
		return person;
	}

}
