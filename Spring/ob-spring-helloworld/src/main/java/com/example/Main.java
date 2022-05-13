package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //EJEMPLO 1
        //Opcion 1. Crear un objeto de forma normal
        //Calculadora service = new Calculadora();

        //Opcion 2. Recibir un objeto de Spring
        Calculadora calculadora = (Calculadora) context.getBean("calculadora");

        String texto = calculadora.holaMundo();
        System.out.println(texto);
        //Se puede volver a obtener
        //OJO: se recupera el mismo objeto
        Calculadora calculadora2 = (Calculadora) context.getBean("calculadora");
        texto = calculadora.holaMundo();
        System.out.println(texto);

        //EJEMPLO2: cargan un bean dentro de otro bean
        GestorFacturas gestor = (GestorFacturas) context.getBean("gestorFacturas");
        System.out.println(gestor.calculadora.holaMundo());


    }
}
