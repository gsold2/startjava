package com.startjava.lesson_1.conditionalstatement;

public class ConditionalStatement {
	public static void main(String[] args) {
		//TODO: созадние класса описания человека
		int age = 44 ;
		if(age > 20) {
			System.out.println("Ваш возраст больше 20");
		}

		boolean isMale = true;
		if(isMale) {
			System.out.println("У Вас мужской пол");
		}

		if(!isMale) {
			System.out.println("У Вас не мужской пол");
		}

		float height = 1.83f;
		if(height < 1.8) {
			System.out.println("Ваш рост меньше 1.8");
		} else {
			System.out.println("Ваш рост больше 1.8");
		}

		char firstLetterName = 'G';
		if(firstLetterName == 'M') {
			System.out.println("Ваше имя начинается на M");
		} else if(firstLetterName == 'I') {
			System.out.println("Ваше имя начинается на I");
		} else {
			System.out.println("Ваше имя не начинается на M или I");
		}
	}
}
