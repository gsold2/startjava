package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private static Scanner in = new Scanner(System.in);
    private Player firstPlayer;
    private Player secondPlayer;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void play() {
        int randomNumber = (int) (Math.random() * 101);
        int attempts = 0;
        String firstPlayerName = firstPlayer.getName();
        String secondPlayerName = secondPlayer.getName();
        int firstInputNubmer;
        int secondInputNubmer;

        do {
            firstInputNubmer = inputNumber(firstPlayerName);
            secondInputNubmer = inputNumber(secondPlayerName);

            firstPlayer.setNumber(firstInputNubmer, attempts);
            secondPlayer.setNumber(secondInputNubmer, attempts);

            if (firstPlayer.getNumber() == randomNumber) {
                firstPlayer.printNumbers();
                System.out.println("Игрок " + firstPlayer.getName() + " угадал число " + randomNumber + " с " + (attempts + 1) + " попытки");
                break;
            } else if (secondPlayer.getNumber() == randomNumber) {
                secondPlayer.printNumbers();
                System.out.println("Игрок " + secondPlayer.getName() + " угадал число " + randomNumber + " с " + (attempts + 1) + " попытки");
                break;
            }
            attempts = attempts + 1;
        } while (attempts < 10);

        if (attempts == 10) {
            firstPlayer.printNumbers();
            System.out.println("У игрока " + firstPlayer.getName() + " закончились попытки");
            secondPlayer.printNumbers();
            System.out.println("У игрока " + secondPlayer.getName() + " закончились попытки");
        }
        firstPlayer.clearNumbers();
        secondPlayer.clearNumbers();
    }

    public int inputNumber(String name) {
        int number;
        do {
            System.out.print(name + " считает, что число равно:");
            while (!in.hasNextInt()) {
                System.out.print(name + " считает, что число равно:");
                in.next();
            }
            number = in.nextInt();
        } while (number < 0);
        return number;
    }
}
