package com.project1.spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



import com.project1.spring_framework.game.GameRunner;
import com.project1.spring_framework.game.MarioGame;
import com.project1.spring_framework.game.PacmanGame;
import com.project1.spring_framework.game.SuperContraGame;

record Person(String name, int age){}
public class App02HelloWorldSpring {

public static void main(String[] args) {
	var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
	System.out.println(context.getBean("name"));
	System.out.println(context.getBean("age"));
	System.out.println(context.getBean("person"));
}
}
