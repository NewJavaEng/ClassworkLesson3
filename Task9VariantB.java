package by.http.lesson3;

import java.util.Scanner;

public class Task9VariantB {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String operation;
		
//		https://www.javatpoint.com/java-do-while-loop
		do {
			System.out.print("A = ");
			int first = sc.nextInt();

			System.out.print("B = ");
			int second = sc.nextInt();
			System.out.println("Press 0 if you want to quit!");
			System.out.print("Enter your operation: ");
			operation = sc.next();

			switch (operation) {
			case "+":
				System.out.println("A + B = " + (first + second));
				break;
			case "-":
				System.out.println("A - B = " + (first - second));
				break;
			case "*":
				System.out.println("A * B = " + (first * second));
				break;
			case "/":
				if (second != 0) {
					System.out.println("A / B = " + (first / (double) second));
				} else {
					System.out.println("ERROR! DIVISION ON ZERO!");
				}
				break;
			case "0":
				System.out.println("GOOD BYE!");
				break;
			default:
				System.out.println("ERROR! CAN'T PERFORM THIS OPERATION!");
				break;
			}
		} while (!operation.equals("0"));

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
