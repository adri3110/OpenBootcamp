package com.example.ejer2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        UserService usuario = (UserService) context.getBean("userService");

        usuario.getNotificacion().notification();

        System.out.println("Hola mundo");
    }

}
