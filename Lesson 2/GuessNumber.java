import java.util.Scanner;

public class GuessNumber {
	private static Scanner in = new Scanner(System.in);
	private Player firstPlayer = new Player();
	private Player secondPlayer = new Player();
	int randomNumber = (int) (Math.random() * 101);

	public GuessNumber(String firstName, String secondName){
		this.firstPlayer.setName(firstName);
		this.secondPlayer.setName(secondName);
	}

	public boolean play() {
		boolean isWinner = false;
		firstPlayer.setNumber(inputNumber("Первый игрок считает, что число равно:"));
		secondPlayer.setNumber(inputNumber("Второй игрок считает, что число равно:"));

		if((firstPlayer.getNumber() == randomNumber) & (secondPlayer.getNumber() == randomNumber)) {
			System.out.println("Игроки " + firstPlayer.getName() + ", "+ secondPlayer.getName() + " угадали число " + randomNumber);
			isWinner = true;
		} else if(firstPlayer.getNumber() == randomNumber) {
			System.out.println("Игрок " + firstPlayer.getName() + " угадал число " + randomNumber);
			isWinner = true;
		} else if(secondPlayer.getNumber() == randomNumber) {
			System.out.println("Игрок " + secondPlayer.getName() + " угадал число " + randomNumber);
			isWinner = true;
		} else {
			System.out.println("Никто из игроков не угадал");
		}
		return isWinner;
	}

	public int inputNumber(String message) {
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
}
