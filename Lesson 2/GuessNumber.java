public class GuessNumber {
	private Player firstPlayer = new Player();
	private Player secondPlayer = new Player();
	int randomNumber = (int) (Math.random() * 101);

	public GuessNumber(String firstName, String secondName){
		this.firstPlayer.setName(firstName);
		this.secondPlayer.setName(secondName);
	}

	public boolean play() {
		boolean isWinner = false;
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

	public void inputNumber(int numberFirst, int numberSecond){
		this.firstPlayer.setNumber(numberFirst);
		this.secondPlayer.setNumber(numberSecond);
	}
}
