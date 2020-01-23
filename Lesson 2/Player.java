public class Player {
	private String name;
	private int number;

	Player(String inputName, int inputNumber) {
		name = inputName;
		number = inputNumber;
	}

	public String getName() {
		return name;
	}

	public boolean guessNumber() {
		boolean isNumber = false;
		int randomNumber = (int) (Math.random() * 101);
		System.out.println("Игрок " + getName() + " предположил " + randomNumber);
		if(number == randomNumber) {
			isNumber = true;
		}
		return isNumber;
	}
}
