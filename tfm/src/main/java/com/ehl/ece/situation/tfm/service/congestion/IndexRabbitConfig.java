package com.ehl.ece.situation.tfm.service.congestion;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 指数注册mq
 * @author lizh
 * @date 2017/10/12
 */
@Configuration
public class IndexRabbitConfig {

	@Bean
	public Queue IndexMessage() {
		return new Queue("QUEUE_COMPOSITE_MANAGEINDEX_T");
	}

	@Bean
	public FanoutExchange IndexExchange() {
		return new FanoutExchange("TOPIC_COMPOSITE_MANAGEINDEX_T");
	}

	@Bean
	Binding bindingIndexExchange(Queue IndexMessage, FanoutExchange IndexExchange) {
		return BindingBuilder.bind(IndexMessage).to(IndexExchange);
	}
}
