package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		saludo hola_mundo = (saludo) context.getBean(s:"saludo")

		String texto = saludo.holaMundo();
		System.out.println(texto);

	}
}
