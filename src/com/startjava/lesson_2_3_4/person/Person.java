package com.startjava.lesson_2_3_4.person;

public class Person {

	String sex = "Man";
	String name = "Gregory";
	float height = 1.8f;
	float weight = 89f;
	int age = 44;

	void go() {
		System.out.println("Я ищу");
	}

	void sit() {
		System.out.println("Я сижу");
	}

	void run() {
		System.out.println("Я бегу");
	}

	String speak() {
		return "Я говорю";
	}

	void learnJava() {
		System.out.println("Я изучаю Java");
	}
}
