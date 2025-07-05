package com.gstech.Notificacoesdistribuidas.config;


import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Value("${rabbitmq.exchange}")
    private String exchangeName;

    @Value("${rabbitmq.queues.email}")
    private String emailQueue;

    @Value("${rabbitmq.queues.sms}")
    private String smsQueue;

    @Value("${rabbitmq.queues.push}")
    private String pushQueue;

    @Value("${rabbitmq.routingKeys.email}")
    private String emailRoutingKey;

    @Value("${rabbitmq.routingKeys.sms}")
    private String smsRoutingKey;

    @Value("${rabbitmq.routingKeys.push}")
    private String pushRoutingKey;

    @Bean
    public TopicExchange exchange() {
        return new TopicExchange(exchangeName);
    }

    @Bean
    public Queue emailQueue() {
        return new Queue(emailQueue);
    }

    @Bean
    public Queue smsQueue() {
        return new Queue(smsQueue);
    }

    @Bean
    public Queue pushQueue() {
        return new Queue(pushQueue);
    }

    @Bean
    public Binding emailBinding(Queue emailQueue, TopicExchange exchange) {
        return BindingBuilder.bind(emailQueue).to(exchange).with(emailRoutingKey);
    }

    @Bean
    public Binding smsBinding(Queue smsQueue, TopicExchange exchange) {
        return BindingBuilder.bind(smsQueue).to(exchange).with(smsRoutingKey);
    }

    @Bean
    public Binding pushBinding(Queue pushQueue, TopicExchange exchange) {
        return BindingBuilder.bind(pushQueue).to(exchange).with(pushRoutingKey);
    }
}





















































