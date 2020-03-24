package org.inurl.spring.cloud.service.consumer.controller;

import org.inurl.spring.cloud.service.producer.api.ProducerApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private ProducerApi producerApi;

    @GetMapping("/hello")
    public Object hello() {
        return producerApi.hello();
    }

}
