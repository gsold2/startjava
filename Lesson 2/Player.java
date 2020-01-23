public class Player {
	private String name;
	private int number;

	Player(String name, int number) {
		this.name = name;
		this.number = number;
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
