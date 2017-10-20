package by.http.lesson3;

public class Task1 {
	
	public static void main(String[] args) {
		
		int a = 0;//��������� �������� ��������� - "��"
		int b = 900;//�������� �������� ��������� - "��"
		int c;
		int firstDigit;
		int secondDigit;
		int thirdDigit;
		int summOfThreeDigits;
		int multiplicationOfThreeDigits;
		
		//http://proglang.su/java/numbers-random
		//Math.random() returns a number from zero to one that is why one should multiply Math.random() in order to receive required number
		int random_number1 = a + (int) (Math.random() * b);
		System.out.println("1st random number: " + random_number1);
		
		//one should add 100 in order to cover full range of numbers from 0 to 999
		c = random_number1 + 100;
		System.out.println("1st random number + 100: " + c);
		
		//����� ������� �� ����� ����� ����� ���� ��� ��������� ������ �� 100
		//��������: 352 / 100 = 3.52 (�.�. ��� � ��� int �� ����������� �������, ����� ������ 3)
		firstDigit = (c / 100);
		System.out.println("1st digit: " + firstDigit);
		
		//��� ��������� ����� ������� ����� ������� ��������� ������ �� 10, � ����� ����� ������� �� ������� �� 10
		//��������: 352 / 10 = 35.2 (�.�. ��� � ��� int �� ����������� �������, ����� ������ 32)
		//35 / 10 = 3.5 - ������� �� ������� �� 10 ����� 5
		secondDigit = (c / 10) % 10;
		System.out.println("2nd digit: " + secondDigit);
		
		//������� ����������� ����� ���������� ������� �� ������� ����� �� 10
		//352 / 10 = 35.2 - �������� �� ������� �� 10 ������ 2
		thirdDigit = c % 10;
		System.out.println("3rd digit: " + thirdDigit);
		
		multiplicationOfThreeDigits = firstDigit * secondDigit * thirdDigit;
		System.out.println("Multiplication of three digits: " + multiplicationOfThreeDigits);
		
		summOfThreeDigits = firstDigit + secondDigit + thirdDigit;
		System.out.println("Summ of three digits: " + summOfThreeDigits);
		
	}
	
}

/*������ 1
������������� ��������� �����, ������� �� ����� ��� �����, 
� ����� ����� � ������������ ��� ����.

�������� ������� ������: 
random(900) ���������� ��������� ����� �� 0 �� 899. 
���� ��������� � ���� 100, �� ��������� �������� �� 100 �� 999 ������������, 
�. �. ���������� ��� ����������� �����.
����� ������� �� ����� ����� ����� ���� ��� ��������� ������ �� 100.
��� ��������� ����� ������� ����� ������� ��������� ������ �� 10, 
� ����� ����� ������� �� ������� �� 10.
������� ����������� ����� ���������� ������� �� ������� ����� �� 10.*/

