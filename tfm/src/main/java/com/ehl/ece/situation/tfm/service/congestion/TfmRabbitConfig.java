package com.ehl.ece.situation.tfm.service.congestion;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Tfm拥堵数据注册mq
 * @author lizh
 * @date 2017/10/12
 */
@Configuration
public class TfmRabbitConfig {

	@Bean
	public Queue TfmCongestMessage() {
		return new Queue("Tfm.congest");
	}

	@Bean
	public FanoutExchange TfmExchange() {
		return new FanoutExchange("TfmExchange");
	}

	@Bean
	Binding bindingCongestExchange(Queue TfmCongestMessage, FanoutExchange TfmExchange) {
		return BindingBuilder.bind(TfmCongestMessage).to(TfmExchange);//.with("Tfm.congest");
	}

	@Bean
	public Queue CongestIndexMessage() {
		return new Queue("Tfm.congestindex");
	}

	@Bean
	public FanoutExchange CongestIndexExchange() {
		return new FanoutExchange("CongestIndexExchange");
	}

	@Bean
	Binding bindingIndexExchange(Queue CongestIndexMessage, FanoutExchange CongestIndexExchange) {
		return BindingBuilder.bind(CongestIndexMessage).to(CongestIndexExchange);//.with("Tfm.congestindex");
	}
}
