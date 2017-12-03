package by.http.lesson3;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		boolean runProcess = true;

		while (runProcess) {

			System.out.print("Enter arithmetic sign: ");
			// next() finds and returns the next complete token from scanner and saves it
			// into variable
			String znak = in.next();

			System.out.println("Enter 2 numbers X and Y: ");
			// read integer number from the stream and save it into variable
			int x = in.nextInt();
			int y = in.nextInt();

			switch (znak) {
			case "+":
				printResult(x + y);
				break;

			case "-":
				printResult(x - y);
				break;

			case "/":
				if (y == 0) {
					System.out.println("Error: Y cannot be equal to 0!");
				} else {
					printResult(x / (double) y); // "y" should be double -> fix your "printResult"
				}

				break;

			case "*":
				printResult(x * y);
				break;

			case "0":
				System.out.println("End of process.");

				runProcess = false;

				break;

			default:
				System.out.println("Error: Incorrect arithmetic sign!");
				break;
			}

			if (runProcess) {

				System.out.println("Start again? (Y/N)");
				String action = in.next();

				if (action.equalsIgnoreCase("N")) {
					runProcess = false;
					System.out.println("End of process.");
				} else if (action.equalsIgnoreCase("Y")) {
					runProcess = true;
				} else if (!action.equals("Y") || !action.equals("N")) {
					System.out.println("Incorrect answer!");
				}
			}

		}
		in.close();

	}

	// http://easy-code.ru/lesson/formatting-numeric-output-java
	// /n and %n - symbols of new line, better to use %n.
	static void printResult(double d) {
		System.out.printf("Result = %.2f %n", d);
	}

}

// Задача 9
// Написать программу, в которой вводятся два операнда Х и Y и знак операции (+,
// –, /, *).
// Вычислить результат Z в зависимости от знака. Предусмотреть реакции на
// возможный неверный знак операции,
// а также на ввод Y=0 при делении.
// Организовать возможность многократных вычислений без перезагрузки программа
// (т.е. построить цикл).
// В качестве символа прекращения вычислений принять ‘0’.
//
// Решение
// Алгоритм решения задачи:
// 1) Вводим знак. Если он является символом '0', то прерываем цикл.
// 2) Если введенный символ принадлежит к перечисленным,
// то запрашиваем два числа и выполняем вычисления в зависимости от введенного
// знака.
// 3) Иначе сообщаем о некорректном вводе знака.
