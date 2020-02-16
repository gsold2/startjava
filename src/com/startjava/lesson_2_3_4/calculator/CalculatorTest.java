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
        //String inputExpression;
        String[] srcMathExpression;
        int number1;
        int number2;
        String operator;

        do {
            System.out.print("Введите математическое выражение:");
            srcMathExpression = in.nextLine().split(" ");
            if (isNumberNotZero(srcMathExpression[0]) && isNumberNotZero(srcMathExpression[2])) {
                number1 = Integer.parseInt(srcMathExpression[0]);
                operator = srcMathExpression[1];
                number2 = Integer.parseInt(srcMathExpression[2]);

                System.out.println(calc.сalculate(number1, operator, number2));
            }
        } while (doNext().equals("да"));
    }

    private static boolean isNumberNotZero(String str) {
        try {
            Integer.parseInt(str);
            if (Integer.parseInt(str) > 0) {
                return true;
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException exc) {
            System.out.println("Необходимо водить целое число больше 0 -> " + str);
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
