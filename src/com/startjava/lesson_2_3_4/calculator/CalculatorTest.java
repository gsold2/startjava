package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Возможные типы математических операций " +
				"с целыми положительными числами:" + "\n" +
				"[Первое число] + [Второе число]" + "\n" +
				"[Первое число] - [Второе число]" + "\n" +
				"[Первое число] * [Второе число]" + "\n" +
				"[Первое число] / [Второе число]" + "\n" +
				"[Первое число] % [Второе число]" + "\n" +
				"[Первое число] ^ [Второе число]" + "\n");

		Calculator calc = new Calculator();
		String inputExpression;
		String[] membersMathematicalExpression;
		int number1;
		int number2;
		String operator;

		do {
			System.out.print("Введите математическое выражение:");
			inputExpression = in.nextLine();
			membersMathematicalExpression = inputExpression.split(" ");
			if (isIntegerGreaterThanZero(membersMathematicalExpression[0]) && isIntegerGreaterThanZero(membersMathematicalExpression[2])) {
				number1 = Integer.parseInt(membersMathematicalExpression[0]);
				operator = membersMathematicalExpression[1];
				number2 = Integer.parseInt(membersMathematicalExpression[2]);

				calc.сalculate(number1, operator, number2);
			}
		} while (doNext().equals("да"));
	}

	public static boolean isIntegerGreaterThanZero(String str) {
		try {
			Integer.parseInt(str);
			if (Integer.parseInt(str) > 0) {
				return true;
			} else {
				System.out.println("Необходимо водить целое число больше 0 -> " + str);
				return false;
			}
		} catch (Exception e) {
			System.out.println("Необходимо водить целое число больше 0 -> " + str);
			return false;
		}
	}

	public static String doNext() {
		String playerAnswer;
		do {
			System.out.print("Хотите продолжить? [да/нет]:");
			playerAnswer = in.nextLine();
		} while (!playerAnswer.equals("да") && !playerAnswer.equals("нет"));
		return playerAnswer;
	}
}
