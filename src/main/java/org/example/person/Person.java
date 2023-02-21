package org.example.person;

import org.example.service.Transport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private Transport transport;

    @Autowired
    public Person(@Qualifier("moto") Transport transport) {
        this.transport = transport;
    }

    public void drive() {
        System.out.println("Владелец сел в (на) транспорт");
        transport.go();
    }
}
