package org.example.service;

import org.example.person.Person;
import org.example.transport.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Transport newTransport() {
        return new Car();
    }

    @Bean
    public Person newPerson() {
        return new Person(newTransport());
    }
}
