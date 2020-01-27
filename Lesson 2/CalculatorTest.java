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

		String doNextCalculation = "да";
		Calculator calc = new Calculator();

		while(doNextCalculation.equals("да")) {
			int number1 = inputNumber("Введите [Первое число]:");

			String operator = "x";
			do {
				System.out.print("Введите знак математической операции:");
				operator = in.next();
			} while((!operator.equals("+")) & (!operator.equals("-")) &
					(!operator.equals("*")) & (!operator.equals("/")) &
					(!operator.equals("%")) & (!operator.equals("^"))
					);

			int number2 = inputNumber("Введите [Второе число]:");

			calc.сalculate(number1, operator, number2);

			doNextCalculation = doNext();
		}
	}

	public static int inputNumber(String inputString) {
		int number = -1;
		do {
			System.out.print(inputString);
			while (!in.hasNextInt()) {
				System.out.print(inputString);
				in.next();
			}
			number = in.nextInt();
		} while (number <= 0);
		return number;
}

	public static String doNext() {
		String inputYesNo = "";
		do {
			System.out.print("Хотите продолжить? [да/нет]:");
			inputYesNo = in.next();
		} while((!inputYesNo.equals("да")) & (!inputYesNo.equals("нет")));
		return inputYesNo;
	}
}
