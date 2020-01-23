import java.util.Scanner;

public class Calculator {
	//TODO: калькулятор для командной строки
	private Scanner in = new Scanner(System.in);

	public void calc() {
		System.out.println("Возможные типы математических операций " +
							"с целыми положительными числами:" + "\n" +
							"[Первое число]+[Второе число] введите с клавиатуры +" + "\n" +
							"[Первое число]-[Второе число] введите с клавиатуры -" + "\n" +
							"[Первое число]*[Второе число] введите с клавиатуры *" + "\n" +
							"[Первое число]/[Второе число] введите с клавиатуры /" + "\n" +
							"[Первое число]%[Второе число] введите с клавиатуры %" + "\n" +
							"[Первое число]^[Второе число] введите с клавиатуры ^"  + "\n");
		System.out.println("Введите знак математической операции:");

		Scanner in = new Scanner(System.in);
		boolean isInputMathSymbole = false;
		char inputMathSymbole = 'x';
		while(!isInputMathSymbole) {
			while(!in.hasNextLine()) {
				System.out.println("Повторите ввод:");
				in.next();
			}
			inputMathSymbole = in.next().charAt(0);

			if((inputMathSymbole == '+') || (inputMathSymbole == '-'
				) || (inputMathSymbole == '*') || (inputMathSymbole == '/'
				) || (inputMathSymbole == '%')  || (inputMathSymbole == '^')) {
				isInputMathSymbole = true;
			} else {
				System.out.println("Повторите ввод:");
			}
		}

		System.out.println("Введите [Первое число]:");
		int number1 = inputNumber("Введите [Первое число]:");

		System.out.println("Введите [Второе число]:");
		int number2 = inputNumber("Введите [Второе число]:");

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

	public int inputNumber(String inputString) {
		int number = 0;
		boolean isNumber = false;
		while(!isNumber) {
			while(!in.hasNextInt()) {
				System.out.print(inputString + "\n");
				in.next();
			}
			number = in.nextInt();

			if(number > 0) {
				isNumber = true;
			} else {
				System.out.print(inputString + "\n");
			}
		}
		return number;
	}
}
