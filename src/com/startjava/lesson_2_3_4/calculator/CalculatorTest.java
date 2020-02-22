package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Возможные типы математических операций " +
                "с целыми положительными числами:" + "\n" +
                "[a] + [b]" + "\n" +
                "[a] - [b]" + "\n" +
                "[a] * [b]" + "\n" +
                "[a] / [b]" + "\n" +
                "[a] % [b]" + "\n" +
                "[a] ^ [b]" + "\n");

        Calculator calc = new Calculator();
        String[] srcMathExpression;
        int number1;
        int number2;
        String operator;

        do {
            System.out.print("Введите математическое выражение:");
            srcMathExpression = in.nextLine().split(" ");
            if (srcMathExpression.length == 3) {
                if (isNumberNotZero(srcMathExpression[0], srcMathExpression[2])) {
                    number1 = Integer.parseInt(srcMathExpression[0]);
                    operator = srcMathExpression[1];
                    number2 = Integer.parseInt(srcMathExpression[2]);
                    System.out.println(calc.calculate(number1, operator, number2));
                }
            } else {
                System.out.println("Ошибка при вводе данных");
            }
        } while (doNext().equals("да"));
    }

    private static boolean isNumberNotZero(String... str) {
        int numbersCorrect = 0;
        try {
            for (int i = 0; i < str.length; i++) {
                Integer.parseInt(str[i]);
                if (Integer.parseInt(str[i]) > 0) {
                    numbersCorrect++;
                } else {
                    throw new NumberFormatException();
                }
            }
        } catch (NumberFormatException exc) {
            System.out.println("Ошибка при вводе данных");
        }

        if (numbersCorrect == str.length) {
            return true;
        } else {
            return false;
        }
    }

    private static String doNext() {
        String playerAnswer;
        do {
            System.out.print("Хотите продолжить? [да/нет]:");
            playerAnswer = in.nextLine();
        } while (!playerAnswer.equals("да") && !playerAnswer.equals("нет"));
        return playerAnswer;
    }
}
