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

		boolean isCalculator = true;
		Calculator calc = new Calculator();

		while(isCalculator) {
			System.out.print("Введите [Первое число]:");
			int number1 = inputNumber("Введите [Первое число]:");

			System.out.print("Введите знак математической операции:");
			boolean isInputMathSymbole = false;
			char inputMathSymbole = 'x';
			while(!isInputMathSymbole) {
				while(!in.hasNextLine()) {
					System.out.print("Введите знак математической операции:");
					in.next();
				}
				inputMathSymbole = in.next().charAt(0);

				if((inputMathSymbole == '+') || (inputMathSymbole == '-'
					) || (inputMathSymbole == '*') || (inputMathSymbole == '/'
					) || (inputMathSymbole == '%')  || (inputMathSymbole == '^')) {
					isInputMathSymbole = true;
				} else {
					System.out.print("Введите знак математической операции:");
				}
			}

			System.out.print("Введите [Второе число]:");
			int number2 = inputNumber("Введите [Второе число]:");

			calc.сalculator(number1, inputMathSymbole, number2);

			isCalculator = yesNo();
		}
	}

	public static int inputNumber(String inputString) {
		int number = 0;
		boolean isNumber = false;
		while(!isNumber) {
			while(!in.hasNextInt()) {
				System.out.print(inputString);
				in.next();
			}
			number = in.nextInt();

			if(number > 0) {
				isNumber = true;
			} else {
				System.out.print(inputString);
			}
		}
		return number;
	}

	public static boolean yesNo() {
		boolean isYesNo = true;
		boolean isCycle = false;
		String inputYesNo = "";
		while(!isCycle) {
			while(!in.hasNextLine()) {
				System.out.print("Хотите продолжить? [да/нет]:");
				in.nextLine();
			}
			inputYesNo = in.nextLine();
			if(inputYesNo.equals("да")) {
				isYesNo = true;
				isCycle = true;
			} else if(inputYesNo.equals("нет")){
				isYesNo = false;
				isCycle = true;
			} else {
				System.out.print("Хотите продолжить? [да/нет]:");
			}
		}
		return isYesNo;
	}
}
