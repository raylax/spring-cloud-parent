package org.inurl.spring.cloud.service.producer.api;


import org.inurl.spring.cloud.service.producer.model.ProducerModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@FeignClient(name = "service-producer")
public interface ProducerApi {

    @GetMapping("/hello")
    ProducerModel hello();

}
