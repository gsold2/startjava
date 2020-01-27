public class Calculator {

	public void сalculate(int number1, String operator, int number2) {
		switch(operator) {
			case "+":
				System.out.println(number1 + "+" + number2 + "=" + (number1 + number2));
				break;
			case "-":
				System.out.println(number1 + "-" + number2 +  "=" + (number1 - number2));
				break;
			case "*":
				System.out.println(number1 + "*" + number2 +  "=" + (number1 * number2));
				break;
			case "/":
				System.out.println(number1 + "/" + number2 +  "=" + (number1 / number2));
				break;
			case "%":
				System.out.println(number1 + "%" + number2 +  "=" + (number1 % number2));
				break;
			case "^":
				int exp = number1;
				for (int i = 1; i < number2; i++) {
					exp *= number1;
				}
				System.out.println(number1 + "^" + number2 + "=" + exp);
				break;
		}
	}
}
