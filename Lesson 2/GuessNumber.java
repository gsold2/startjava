import java.util.Scanner;

public class GuessNumber {
	private Scanner in = new Scanner(System.in);

	public void Game() {
		System.out.println("Загадайте целое число в диапазоне от 0 до 100:");
		int hiddenNumber = inputNumber();

		System.out.println("Введите имя первого игрока:");
		String firstName = inputString();

		System.out.println("Введите имя второго игрока:");
		String secondName = inputString();

		Player firstPlayer = new Player(firstName, hiddenNumber);
		Player secondPlayer = new Player(secondName, hiddenNumber);

		boolean isPlay = true;
		boolean isFirstPlayer = false;
		boolean isSecondPlayer = false;

		while(isPlay) {
			isFirstPlayer = firstPlayer.guessNumber();
			isSecondPlayer = secondPlayer.guessNumber();
			if((isFirstPlayer) && (isSecondPlayer)) {
				System.out.println("Игроки " + firstPlayer.getName() + " и " + secondPlayer.getName() + " угадали число");
				isPlay = false;
			} else if(isFirstPlayer) {
				System.out.println("Игрок " + firstPlayer.getName() + " угадал число");
				isPlay = false;
			} else if(isSecondPlayer) {
				System.out.println("Игрок " + secondPlayer.getName() + " угадал число");
				isPlay = false;
			} else {
		 		isPlay = YesNo();
			}
		}
	}

	public int inputNumber() {
		int number = -1;
		boolean isNumber = false;
		while(!isNumber) {
			while(!in.hasNextInt()) {
				System.out.print("Повторите ввод:");
				in.next();
			}
			number = in.nextInt();

			if((0 <= number) && (number <= 100)) {
				isNumber = true;
			} else {
				System.out.print("Повторите ввод:");
			}
		}
		return number;
	}

	public String inputString() {
		boolean isInputString = false;
		String inputString = "";
		while(!isInputString) {
			while(!in.hasNextLine()) {
				System.out.print("Повторите ввод:");
				in.nextLine();
			}
			inputString = in.nextLine();
			if(inputString.length()!=0) {
				isInputString = true;
			}
		}
		return inputString;
	}

	public boolean YesNo() {
		boolean isYesNo = true;
		boolean isCycle = false;
		String inputYesNo = "";
		System.out.println("Хотите продолжить? [да/нет]:");
		while(!isCycle) {
			inputYesNo = inputString();
			if(inputYesNo.equals("да")) {
				isYesNo = true;
				isCycle = true;
			} else if(inputYesNo.equals("нет")){
				isYesNo = false;
				isCycle = true;
			} else {
				System.out.println("Повторите ввод:");
			}
		}
		return isYesNo;
	}
}
