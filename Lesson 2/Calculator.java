public class Calculator {

	public void сalculator(int number1, char inputMathSymbole, int number2) {
		switch(inputMathSymbole) {
			case '+':
				System.out.println(number1 + "+" + number2 + "=" + (number1 + number2));
				break;
			case '-':
				System.out.println(number1 + "-" + number2 +  "=" + (number1 - number2));
				break;
			case '*':
				System.out.println(number1 + "*" + number2 +  "=" + (number1 * number2));
				break;
			case '/':
				System.out.println(number1 + "/" + number2 +  "=" + (number1 / number2));
				break;
			case '%':
				System.out.println(number1 + "%" + number2 +  "=" + (number1 % number2));
				break;
			case '^':
				int exp = number1;
				for (int i = 1; i < number2; i++) {
					exp *= number1;
				}
				System.out.print(number1 + "^" + number2 + "=" + exp);
				break;
		}
	}
}
