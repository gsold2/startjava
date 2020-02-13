package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int lastNumber;
    private int[] numberArray = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int lastNumber() {
        return lastNumber;
    }

    public int[] getNumberArray() {
        return numberArray;
    }

    public void setNumberArray(int number, int count) {
        this.lastNumber = number;
        this.numberArray[count] = number;
    }

    public void setNumberArrayZero(int count) {
        Arrays.fill(this.numberArray, 0, count, 0);
    }
}
