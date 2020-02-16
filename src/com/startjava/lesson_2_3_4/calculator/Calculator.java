package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static String сalculate(int number1, String operator, int number2) {
        String calculationResult;
        switch (operator) {
            case "+":
                calculationResult = Integer.toString(Math.addExact(number1, number2));
                break;
            case "-":
                calculationResult = Integer.toString(Math.subtractExact(number1, number2));
                break;
            case "*":
                calculationResult = Integer.toString(Math.multiplyExact(number1, number2));
                break;
            case "/":
                calculationResult = Double.toString(Double.valueOf(number1) / Double.valueOf(number2));
                break;
            case "%":
                calculationResult = Double.toString(Double.valueOf(number1) % Double.valueOf(number2));
                break;
            case "^":
                calculationResult = Double.toString(Math.pow(number1, number2));
                break;
            default:
                calculationResult = "Неверно введен символ математической операции";
                break;
        }
        return calculationResult;
    }
}
