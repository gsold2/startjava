import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		//TODO: калькулятор для командной строки
		System.out.println("Возможные типы математических операций " +
							"с целыми положительными числами:" + "\n" +
							"Сложение - введите с клавиатуры +" + "\n" +
							"Вычетание - введите с клавиатуры -" + "\n" +
							"Умножение - введите с клавиатуры *" + "\n" +
							"Деление - введите с клавиатуры /" + "\n" +
							"Деление по модулю - введите с клавиатуры %" + "\n" +
							"Возведение в степень - введите с клавиатуры ^"  + "\n");
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

		if(inputMathSymbole == '+') {
			System.out.println("Введите первое слогаемое:");
		} else if(inputMathSymbole == '-') {
			System.out.println("Введите уменьшаемое:");
		} else if(inputMathSymbole == '*') {
			System.out.println("Введите первый множитель:");
		} else if(inputMathSymbole == '/') {
			System.out.println("Введите делимое:");
		} else if(inputMathSymbole == '%') {
			System.out.println("Введите делимое:");
		} else if(inputMathSymbole == '^') {
			System.out.println("Введите основание:");
		}

		int number1 = inputNumber();

		if(inputMathSymbole == '+') {
			System.out.println("Введите второе слогаемое:");
		} else if(inputMathSymbole == '-') {
			System.out.println("Введите вычитаемое:");
		} else if(inputMathSymbole == '*') {
			System.out.println("Введите второй множитель:");
		} else if(inputMathSymbole == '/') {
			System.out.println("Введите делитель:");
		} else if(inputMathSymbole == '%') {
			System.out.println("Введите делитель:");
		} else {
			System.out.println("Введите степень:");
		}

		int number2 = inputNumber();

		if(inputMathSymbole == '+') {
			System.out.println("Сумма слогаемых равна " + (number1 + number2));
		} else if(inputMathSymbole == '-') {
			System.out.println("Разность равна " + (number1 - number2));
		} else if(inputMathSymbole == '*') {
			System.out.println("Произведение равно " + (number1 * number2));
		} else if(inputMathSymbole == '/') {
			System.out.println("Частное равно " + (number1 / number2));
		} else if(inputMathSymbole == '%') {
			System.out.println("Остаток деления " + (number1 % number2));
		} else {
			int exp = number1;
			for (int i = 1; i < number2; i++) {
				exp *= number1;
			}
			System.out.println("Результат возведения в степень " + exp);
		}
	}

	private static int inputNumber() {
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
