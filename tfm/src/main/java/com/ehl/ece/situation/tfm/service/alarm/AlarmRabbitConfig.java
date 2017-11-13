package com.ehl.ece.situation.tfm.service.alarm;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 警情注册mq
 * @author lizh
 * @date 2017/10/12
 */
@Configuration
public class AlarmRabbitConfig {

	@Bean
	public Queue AlarmMessage() {
		return new Queue("Alarm.alarm");
	}
	@Bean
	public FanoutExchange AlarmExchange() {
		return new FanoutExchange("AlarmExchange");
	}

	@Bean
	Binding bindingAlarmExchange(Queue AlarmMessage, FanoutExchange AlarmExchange) {
		return BindingBuilder.bind(AlarmMessage).to(AlarmExchange);
	}
}
