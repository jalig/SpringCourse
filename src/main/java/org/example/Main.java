package org.example;

import org.example.person.Person;
import org.example.service.Config;
import org.example.service.Transport;
import org.example.transport.Moto;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        Person person = context.getBean("newPerson", Person.class);

        person.drive();

        context.close();

















//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext("applicationContext3.xml");
//
//        Transport transport1 = context.getBean("moto", Moto.class);
//        Transport transport2 = context.getBean("moto", Moto.class);
//
//        System.out.println(transport1 == transport2);
//
//
//        context.close();
    }

}
