import java.util.Scanner;

public class CalculatorTest {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Возможные типы математических операций " +
								"с целыми положительными числами:" + "\n" +
								"[Первое число]+[Второе число]" + "\n" +
								"[Первое число]-[Второе число]" + "\n" +
								"[Первое число]*[Второе число]" + "\n" +
								"[Первое число]/[Второе число]" + "\n" +
								"[Первое число]%[Второе число]" + "\n" +
								"[Первое число]^[Второе число]"  + "\n");

		Calculator calc = new Calculator();

		do {
			int number1 = inputNumber("Введите [Первое число]:");

			char operator;
			do {
				System.out.print("Введите знак математической операции:");
				operator = in.next().charAt(0);
			} while(operator != '+' && operator != '-' &&
					operator != '*' && operator != '/' &&
					operator != '%' && operator != '^'
					);

			int number2 = inputNumber("Введите [Второе число]:");
			calc.сalculate(number1, operator, number2);
		} while(doNext().equals("да"));
	}

	public static int inputNumber(String message) {
		int number;
		do {
			System.out.print(message);
			while (!in.hasNextInt()) {
				System.out.print(message);
				in.next();
			}
			number = in.nextInt();
		} while (number <= 0);
		return number;
	}

	public static String doNext() {
		String playerAnswer;
		do {
			System.out.print("Хотите продолжить? [да/нет]:");
			playerAnswer = in.next();
		} while(!playerAnswer.equals("да") && !playerAnswer.equals("нет"));
		return playerAnswer;
	}
}
