package com.startjava.lesson_1.cycle;

public class Cycle {
	public static void main(String[] args) {
		System.out.println("Вывод на консоль с помощью цикла For чисел [0, 20]:");
		for(int i = 0; i <= 20; i++) {
			System.out.print(i + "; ");
		}

		System.out.print("\n");
		System.out.println("Вывод на консоль с помощью цикла While всех чисел от [6, -6] (шаг итерации 2):");
		int counter = 6;
		while(counter >= -6) {
			System.out.print(counter + "; ");
			counter -= 2;
		}

		System.out.print("\n");
		System.out.println("Вывод на консоль с помощью цикла Do-While сумму всех нечетных чисел [10, 20]:");
		counter = 10;
		int sum = 0;
		do {
			if(counter % 2 != 0) {
				sum += counter;
			}
			counter++;
		} while(counter <= 20);
		System.out.println(sum);
	}
}
