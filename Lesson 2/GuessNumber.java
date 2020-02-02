import java.util.Scanner;

public class GuessNumber {
	private static Scanner in = new Scanner(System.in);
	private Player firstPlayer;
	private Player secondPlayer;

	public GuessNumber(Player firstPlayer, Player secondPlayer){
		this.firstPlayer = firstPlayer;
		this.secondPlayer = secondPlayer;
	}

	public void play() {
		int randomNumber = (int) (Math.random() * 101);
		do {
			firstPlayer.setNumber(inputNumber(firstPlayer.getName()));
			secondPlayer.setNumber(inputNumber(secondPlayer.getName()));

			if((firstPlayer.getNumber() == randomNumber) && (secondPlayer.getNumber() == randomNumber)) {
				System.out.println("Игроки " + firstPlayer.getName() + ", "+ secondPlayer.getName() + " угадали число " + randomNumber);
			} else if(firstPlayer.getNumber() == randomNumber) {
				System.out.println("Игрок " + firstPlayer.getName() + " угадал число " + randomNumber);
			} else if(secondPlayer.getNumber() == randomNumber) {
				System.out.println("Игрок " + secondPlayer.getName() + " угадал число " + randomNumber);
			} else {
				System.out.println("Никто из игроков не угадал");
			}
		} while((firstPlayer.getNumber() != randomNumber) && (secondPlayer.getNumber() != randomNumber));
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
