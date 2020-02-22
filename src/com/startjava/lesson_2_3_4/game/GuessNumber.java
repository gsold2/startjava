package com.startjava.lesson_2_3_4.game;

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
        int attempts = 1;

        do {
            inputNumber(firstPlayer);
            inputNumber(secondPlayer);

            if (firstPlayer.getLastNumber() == randomNumber) {
                System.out.println("Игрок " + firstPlayer.getName() + " угадал число " + randomNumber + " с " + (attempts + 1) + " попытки");
                break;
            } else if (secondPlayer.getLastNumber() == randomNumber) {
                System.out.println("Игрок " + secondPlayer.getName() + " угадал число " + randomNumber + " с " + (attempts + 1) + " попытки");
                break;
            }
            attempts++;
        } while (attempts < 11);

        if (attempts == 11) {
            printNumbers(firstPlayer);
            printNumbers(secondPlayer);
            System.out.println("У игрока " + firstPlayer.getName() + " закончились попытки" + "\n" +
                    "У игрока " + secondPlayer.getName() + " закончились попытки");
        }

        firstPlayer.clearNumbers();
        secondPlayer.clearNumbers();
    }

    public void inputNumber(Player player) {
        int number;
        do {
            System.out.print(player.getName() + " считает, что число равно:");
            while (!in.hasNextInt()) {
                System.out.print(player.getName() + " считает, что число равно:");
                in.next();
            }
            number = in.nextInt();
        } while (number < 0);
        player.setNumber(number);
    }

    public void printNumbers(Player player) {
        System.out.print("Игрок " + player.getName() + " назвал ");
        for (int i : player.enteredNumbers()) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }
}
