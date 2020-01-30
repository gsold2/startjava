import java.util.Scanner;

public class GuessNumberTest {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		//TODO: Игроки должны угадать число
		System.out.println("Загадано число в диапазоне от 1 до 100" + "\n" +
							"игроки должны по очереди пытаться его угадать");

		String firstName = inputName("Введите имя первого игрока:");
		String secondName = inputName("Введите имя второго игрока:");

		GuessNumber game = new GuessNumber(firstName, secondName);

		String playerAnswer = "да";
		boolean isWinner = false;
		do {
			isWinner = game.play();
			if(!isWinner) {
				playerAnswer = doNext();
			}
		} while(playerAnswer.equals("да") & !isWinner);
	}

	public static String inputName(String message) {
		String name;
		do {
			System.out.print(message);
			name = in.nextLine();
		} while(name.isEmpty());
		return name;
	}

	public static String doNext() {
		String inputYesNo;
		do {
			System.out.print("Хотите продолжить? [да/нет]:");
			inputYesNo = in.next();
		} while((!inputYesNo.equals("да")) & (!inputYesNo.equals("нет")));
		return inputYesNo;
	}
}
