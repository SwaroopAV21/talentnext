package com.abc.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.abc.entity.Employee;

@org.springframework.stereotype.Service
public class Service {
    
    @Value("${rabbitmq.exchange.name}")
    private String exchange;

    @Value("${rabbitmq.routing.key}")
    private String routingkey;

    @Autowired
    private RabbitTemplate rt;

    public void sendmessage(Employee e){
        rt.convertAndSend(exchange, routingkey, e);
    }
}
