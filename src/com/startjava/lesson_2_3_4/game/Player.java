package com.startjava.lesson_2_3_4.game;

public class Player {
    private String name;
    private int[] numbers = new int[10];
    private int index;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number, int index) {
        this.numbers[index] = number;
        this.index = index;
    }

    public int getNumber() {
        return numbers[index];
    }

    public void clearNumbers() {
        int count = 0;
        do {
            numbers[count] = 0;
            count++;
        } while (count <= index);
     }

    public void printNumbers() {
        int count = 0;
        System.out.print("Игрок " + name + " назвал ");
        do {
            System.out.print(numbers[count] + " ");
            count++;
        } while (count <= index);
        System.out.print("\n");
    }
}
