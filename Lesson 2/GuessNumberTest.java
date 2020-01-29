import java.util.Scanner;

public class GuessNumberTest {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		//TODO: Игроки должны угадать число
		System.out.println("Загадано число в диапазоне от 1 до 100" + "\n" +
							"игроки должны по очереди пытаться его угадать");

		String firstName = name("Введите имя первого игрока:");
		String secondName = name("Введите имя второго игрока:");

		GuessNumber game = new GuessNumber(firstName, secondName);

		String calculation = "да";
		int numberFirst;
		int numberSecond;
		boolean isWinner = false;
		do {
			numberFirst = inputNumber("Первый игрок считает, что число равно:");
			numberSecond = inputNumber("Второй игрок считает, что число равно:");
			game.inputNumber(numberFirst, numberSecond);

			isWinner = game.play();

			if(!isWinner) {
				calculation = doNext();
			}
		} while(calculation.equals("да") & !isWinner);
	}

	public static String name(String message) {
		String name = "";
		do {
			System.out.print(message);
			name = in.nextLine();
		} while(name.equals(""));
		return name;
	}

	public static int inputNumber(String message) {
		int number;
		do {
			System.out.print(message);
			while (!in.hasNextInt()) {
				System.out.print(message);
				in.next();
			}
			number = in.nextInt();
		} while (number < 0);
		return number;
	}

	public static String doNext() {
		String inputYesNo = "";
		do {
			System.out.print("Хотите продолжить? [да/нет]:");
			inputYesNo = in.next();
		} while((!inputYesNo.equals("да")) & (!inputYesNo.equals("нет")));
		return inputYesNo;
	}
}
