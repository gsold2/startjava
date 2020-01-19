import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		//TODO: калькулятор для командной строки
		System.out.println("Возможные типы математических операций " +
							"с целыми положительными числами:" + "\n" +
							"[Первое число]+[Второе число] введите с клавиатуры +" + "\n" +
							"[Первое число]-[Второе число] введите с клавиатуры -" + "\n" +
							"[Первое число]*[Второе число] введите с клавиатуры *" + "\n" +
							"[Первое число]/[Второе число] введите с клавиатуры /" + "\n" +
							"[Первое число]%[Второе число] введите с клавиатуры %" + "\n" +
							"[Первое число]^[Второе число] введите с клавиатуры ^"  + "\n");
		System.out.println("Введите симовол операции из предложенных выше:");

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
		int number1 = inputNumber();

		System.out.println("Введите [Второе число]:");
		int number2 = inputNumber();

		if(inputMathSymbole == '+') {
			System.out.println(number1 + "+" + number2 + "=" + (number1 + number2));
		} else if(inputMathSymbole == '-') {
			System.out.println(number1 + "-" + number2 +  "=" + (number1 - number2));
		} else if(inputMathSymbole == '*') {
			System.out.println(number1 + "*" + number2 +  "=" + (number1 * number2));
		} else if(inputMathSymbole == '/') {
			System.out.println(number1 + "/" + number2 +  "=" + (number1 / number2));
		} else if(inputMathSymbole == '%') {
			System.out.println(number1 + "%" + number2 +  "=" + (number1 % number2));
		} else {
			int exp = number1;
			for (int i = 1; i < number2; i++) {
				exp *= number1;
			}
			System.out.println(number1 + "^" + number2 + "=" + exp);
		}
	}

	public static int inputNumber() {
		int number = 0;
		boolean isNumber = false;
		Scanner in = new Scanner(System.in);
		while(!isNumber) {
			while(!in.hasNextInt()) {
				System.out.println("Повторите ввод:");
				in.next();
			}
			number = in.nextInt();

			if(number > 0) {
				isNumber = true;
			} else {
				System.out.println("Повторите ввод:");
			}
		}
		return number;
	}
}
