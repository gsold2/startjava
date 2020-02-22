package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[10];
    private int index = -1;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        index++;
        this.numbers[index] = number;
    }

    public int getLastNumber() {
        return numbers[index];
    }

    public void clearNumbers() {
        Arrays.fill(numbers, 0, (index + 1), 0);
        index = -1;
    }

    public int[] enteredNumbers() {
        int[] numbers = Arrays.copyOf(this.numbers, (index + 1));
        return numbers;
    }
}
