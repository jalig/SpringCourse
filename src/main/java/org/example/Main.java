package org.example;

import org.example.introduction.Car;
import org.example.introduction.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

    public static void main(String[] args) {

//        Car car = new Car();
//        car.go();

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        ClassPathXmlApplicationContext context2 =
                new ClassPathXmlApplicationContext("applicationContext2.xml");


        Car car1 = context.getBean("customCar", Car.class);
        Car car2 = context.getBean("customCar", Car.class);

        System.out.println(car1 == car2);

        Car car3 = context2.getBean("customCar", Car.class);
        Car car4 = context2.getBean("customCar", Car.class);

        System.out.println(car3 == car4);

//        car1.go();

//        Person person = context.getBean("customPerson", Person.class);
//        person.drive();


        context.close();
        context2.close();


    }

}
