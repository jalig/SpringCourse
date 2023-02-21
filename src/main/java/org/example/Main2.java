package org.example;

import org.example.service.Transport;
import org.example.transport.Car;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main2 {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Transport transport1 = context.getBean("car", Car.class);
        Transport transport2 = context.getBean("car", Car.class);

        System.out.println(transport1 == transport2);

        context.close();
    }

}
