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
        int count = 0;
        do {
            firstPlayer.setNumberArray(inputNumber(firstPlayer.getName()), count);
            secondPlayer.setNumberArray(inputNumber(secondPlayer.getName()), count);

            if (firstPlayer.lastNumber() == randomNumber) {
                System.out.println("Игрок " + firstPlayer.getName() + " угадал число " + randomNumber + " с " + (count + 1) + " попытки");
                break;
            } else if (secondPlayer.lastNumber() == randomNumber) {
                System.out.println("Игрок " + secondPlayer.getName() + " угадал число " + randomNumber + " с " + (count + 1) + " попытки");
                break;
            }
            count = count + 1;
        } while (count < 10);

        if (firstPlayer.lastNumber() != randomNumber & count == 10) {
            printNumberArray(firstPlayer, count);
            System.out.println("У игрока " + firstPlayer.getName() + " закончились попытки");
        }

        if (secondPlayer.lastNumber() != randomNumber & count == 10) {
            printNumberArray(secondPlayer, count);
            System.out.println("У игрока " + secondPlayer.getName() + " закончились попытки");
        }

        firstPlayer.setNumberArrayZero(count);
        secondPlayer.setNumberArrayZero(count);
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

    public void printNumberArray(Player player, int count) {
        int[] guessNumberArray = Arrays.copyOf(player.getNumberArray(), count);
        System.out.print("Игрок " + player.getName() + " назвал ");
        for (int guessNumber : guessNumberArray) {
            System.out.print(guessNumber + " ");
        }
        System.out.print("\n");
    }
}
