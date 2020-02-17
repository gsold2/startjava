package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int number, int count) {
        this.numbers[count] = number;
    }

    public int getNumber(int count) {
        return numbers[count];
    }

    public void clearNumbers(int count) {
        Arrays.fill(this.numbers, 0, count, 0);
    }
}
