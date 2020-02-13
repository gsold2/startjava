package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

	public void сalculate(int number1, String operator, int number2) {
		switch (operator) {
			case "+":
				System.out.println(number1 + "+" + number2 + "=" + Math.addExact(number1, number2));
				break;
			case "-":
				System.out.println(number1 + "-" + number2 + "=" + Math.subtractExact(number1, number2));
				break;
			case "*":
				System.out.println(number1 + "*" + number2 + "=" + Math.multiplyExact(number1, number2));
				break;
			case "/":
				System.out.println(number1 + "/" + number2 + "=" + (number1 / number2));
				break;
			case "%":
				System.out.println(number1 + "%" + number2 + "=" + Math.IEEEremainder(number1, number2));
				break;
			case "^":
				System.out.println(number1 + "^" + number2 + "=" + Math.pow(number1, number2));
				break;
			default:
				System.out.println("Неверно введен символ математической операции -> " + operator);
				break;
		}
	}
}
