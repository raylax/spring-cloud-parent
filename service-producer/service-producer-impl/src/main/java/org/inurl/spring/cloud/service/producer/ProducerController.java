package org.inurl.spring.cloud.service.producer;

import org.inurl.spring.cloud.service.producer.model.ProducerModel;
import org.inurl.spring.cloud.service.producer.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProducerController {

    @Autowired
    private ProducerService producerService;

    @GetMapping("/hello")
    public ProducerModel hello() {
        return producerService.hello();
    }

}
