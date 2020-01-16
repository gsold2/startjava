import java.util.Scanner;

public class MyFirstGame {
	public static void main(String[] args) {
		// TODO: "Загадывается"" число в диапазоне от 0 до 100,
		// пользователь должен отгадать
		int guessNumber = 10;
		int inputNumber = -1;
		Scanner in = new Scanner(System.in);
		System.out.println("Загадано целое число в диапазоне от 0 до 100");
		System.out.print("Отгадайте это число:");

		do {
			while(!in.hasNextInt()) {
				System.out.println("Неверный ввод");
				System.out.print("Введите число:");
				in.nextLine();
			}
			inputNumber = in.nextInt();

			if(guessNumber > inputNumber) {
				System.out.println("Ваше число меньше загаданного");
				System.out.print("Введите число:");
			} else if(guessNumber < inputNumber) {
				System.out.println("Ваше число больше загаданного");
				System.out.print("Введите число:");
			}
		} while(guessNumber != inputNumber);

		System.out.print("Вы угадали!!!");
	}
}
