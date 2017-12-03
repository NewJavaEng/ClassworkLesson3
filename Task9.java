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

// ������ 9
// �������� ���������, � ������� �������� ��� �������� � � Y � ���� �������� (+,
// �, /, *).
// ��������� ��������� Z � ����������� �� �����. ������������� ������� ��
// ��������� �������� ���� ��������,
// � ����� �� ���� Y=0 ��� �������.
// ������������ ����������� ������������ ���������� ��� ������������ ���������
// (�.�. ��������� ����).
// � �������� ������� ����������� ���������� ������� �0�.
//
// �������
// �������� ������� ������:
// 1) ������ ����. ���� �� �������� �������� '0', �� ��������� ����.
// 2) ���� ��������� ������ ����������� � �������������,
// �� ����������� ��� ����� � ��������� ���������� � ����������� �� ����������
// �����.
// 3) ����� �������� � ������������ ����� �����.
