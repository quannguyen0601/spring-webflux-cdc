package com.quan.demo.debezium.sink.common.listener;

import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class UserListener {

    @KafkaListener(id = "user-listener",topics = "postgre-demo-user.public.User")
    public void listener(Object data) {
        log.info("Get message {}", data);
    }
}
