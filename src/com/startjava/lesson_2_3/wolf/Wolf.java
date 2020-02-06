package com.startjava.lesson_2_3.wolf;

public class Wolf {

	private String sex;
	private String name;
	private float weight;
	private int age;
	private String color;

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age > 8) {
			System.out.println("Некорректный возраст");
		} else {
			this.age = age;
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void go() {
		System.out.println("Да, иду я иду.");
	}

	public void sit() {
		System.out.println("Да, сижу я сижу.");
	}

	public void run() {
		System.out.println("Да, бегу я бегу.");
	}

	public Boolean howl() {
		System.out.println("А теперь повоем.");
		return true;
	}

	public void hunt() {
		System.out.println("Счастливой охоты.");
	}
}
