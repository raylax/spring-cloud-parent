package org.inurl.spring.cloud.service.producer.server.impl;

import org.inurl.spring.cloud.service.producer.model.ProducerModel;
import org.inurl.spring.cloud.service.producer.service.ProducerService;
import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Service
public class ProducerServiceImpl implements ProducerService {

    @Override
    public ProducerModel hello() {
        ProducerModel m = new ProducerModel();
        m.setCode(200);
        m.setMessage("hello, from " + getHostname());
        return m;
    }

    private static String getHostname() {
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return "UNKNOWN";
    }

}
