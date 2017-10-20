package by.http.lesson3;

public class Task4 {
	
	public static void main(String[] args) {
		
		int ourNum = 4567;	
		int a;
		int b;
		int c;
		int d;
		int e;
		
		//��� ���������� ����� �� �������� �������, ���� ����� ������ �������� �� 1000
		//4567 / 1000 = 4.567 (�.�. ��� � ��� int, �� �������� ������ ����� ����� ������ 4)
		a = (ourNum / 1000);
		System.out.println("First Digit = " + a);
		
		//��� ���������� ������� (�� �����������) �������, ������� ����� ����� �� 100, ����� ����������� �� ������� �������, ����� ������� �� ������� �� 10
		//4567 / 100 = 45.67 (�.�. ��� � ��� int, �� �������� ������ ����� ����� ������ 45)
		//45 / 10 = 4.5 - ������� �� ������� ����� 5
		b = (ourNum / 100) % 10;
		System.out.println("Second Digit = " + b);
		
		//��� ���������� �������� (�� �����������) �������, ������� ����� ����� �� 10, ����� ����������� �� ������� �������, ����� ������� �� ������� �� 10.
		//4567 / 10 = 456.7  (�.�. ��� � ��� int, �� �������� ������ ����� ����� ������ 456)
		//456 / 10 = 45.6 - ������� �� ������� 6
		c = (ourNum / 10) % 10;
		System.out.println("Third Digit = " + c);
		
		//��������� (���������) ����� ����������� ��� ������� �� ������� ��������� ����� �� 10
		//4567 / 10 = 456.7 - ������� �� ������� 7
		d = ourNum % 10;
		System.out.println("Fourth digit = " + d);
		
		e = a * b + c * d;
		System.out.println("1st Digit * 2nd Digit + 3rd Digit * 4th Digit = " + e);
		
	}
	
}

/*������ 4
�������� �������������� ����� (abcd). ������� ����� a*b + c*d.

�������
� ������ ������ ����� �������� ��� �����, �.�. �������� ����������� �����.
��� ���������� ����� �� �������� �������, ���� ����� ������ �������� �� 1000. 
(��� ����� ������� �� ������� �� 10000.)
��� ���������� ������� (�� �����������) �������, ������� ����� ����� �� 100, 
����� ����������� �� ������� �������, ����� ������� �� ������� �� 10.
������ ����� ����������� ����� ��� ������ �� ����������� ����, ��� ������ ������ ���� �� 10.
��������� (���������) ����� ����������� ��� ������� �� ������� ��������� ����� �� 10.*/