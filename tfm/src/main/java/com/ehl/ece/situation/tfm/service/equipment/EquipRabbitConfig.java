package com.ehl.ece.situation.tfm.service.equipment;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 设备运行状态数据注册mq
 * @author lizh
 * @date 2017/10/12
 */
@Configuration
public class EquipRabbitConfig {

	@Bean
	public Queue EquipMessage() {
		return new Queue("QUEUE_PUBLIC_EQUIPMENTSTATUS_T");
	}

	@Bean
	public FanoutExchange EquipExchange() {
		return new FanoutExchange("TOPIC_PUBLIC_EQUIPMENTSTATUS_T");
	}

	@Bean
	Binding bindingEquipExchange(Queue IndexMessage, FanoutExchange IndexExchange) {
		return BindingBuilder.bind(IndexMessage).to(IndexExchange);
	}
}
