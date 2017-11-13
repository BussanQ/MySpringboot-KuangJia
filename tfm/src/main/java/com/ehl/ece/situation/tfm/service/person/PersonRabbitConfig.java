package com.ehl.ece.situation.tfm.service.person;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 警力注册mq
 * @author lizh
 * @date 2017/10/12
 */
@Configuration
public class PersonRabbitConfig {

	@Bean
	public Queue PersonMessage() {
		return new Queue("Person.person");
	}
	@Bean
	public Queue PlanUsersMessage() {
		return new Queue("Person.planuser");
	}
	@Bean
	public Queue PlanMessage() {
		return new Queue("Person.plan");
	}
	@Bean
	public FanoutExchange PersonExchange() {
		return new FanoutExchange("PersonExchange");
	}

	@Bean
	Binding bindingPerson(Queue PersonMessage, FanoutExchange PersonExchange) {
		return BindingBuilder.bind(PersonMessage).to(PersonExchange);//.with("Person.person");
	}

	@Bean
	Binding bindingPlanUsers(Queue PlanUsersMessage, FanoutExchange PersonExchange) {
		return BindingBuilder.bind(PlanUsersMessage).to(PersonExchange);//.with("Person.planuser");
	}

	@Bean
	Binding bindingPlan(Queue PlanMessage, FanoutExchange PersonExchange) {
		return BindingBuilder.bind(PlanMessage).to(PersonExchange);//.with("Person.plan");
	}
}
