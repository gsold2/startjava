package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static Double calculate(int number1, String operator, int number2) {
        switch (operator) {
            case "+":
                return (double) Math.addExact(number1, number2);
            case "-":
                return (double) Math.subtractExact(number1, number2);
            case "*":
                return (double) Math.multiplyExact(number1, number2);
            case "/":
                return ((double) number1 / (double) number2);
            case "%":
                return ((double) number1 % (double) number2);
            case "^":
                return Math.pow(number1, number2);
            default:
                return null;
        }
    }
}
