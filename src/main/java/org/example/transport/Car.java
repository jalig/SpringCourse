package org.example.transport;

import org.example.service.Transport;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
//@Scope("singleton")
public class Car implements Transport {
    @Override
    public void go() {
        System.out.println("Автомобиль едет");
    }

    @PostConstruct
    public void init() {
        System.out.println("Class Car: init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Class Car: destroy");
    }
}
