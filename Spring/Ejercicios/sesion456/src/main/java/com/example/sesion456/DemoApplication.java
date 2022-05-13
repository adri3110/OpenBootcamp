package com.example.sesion456;

import com.example.sesion456.entities.Laptop;
import com.example.sesion456.repository.LaptopRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);

		Laptop laptop1 = new Laptop(null, "Asus","Intel core i7", 16, 1024);
		Laptop laptop2 = new Laptop(null, "Hp","Intel core i5", 12, 512);
		Laptop laptop3 = new Laptop(null, "Acer","Intel core i3", 8, 256);

		repository.save(laptop1);
		repository.save(laptop2);
		repository.save(laptop3);

		System.out.println("Ejecutando aplicación");
	}
}
