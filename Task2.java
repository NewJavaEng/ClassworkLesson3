package by.http.lesson3;

public class Task2 {
	
	public static void main(String[] args) {
		int firstVar = 3;
		int secondVar = 15;
		int c;//�������� ����������
		
		//� �������� ���������� ����������� �������� ������ ����������
		c = firstVar;
		System.out.println("c = first variable = " + c);
			
		//������ ���������� ������������� �������� ������
		firstVar = secondVar;
		System.out.println("first variable = second variable = " + firstVar);
			
		//������ ���������� ������������� �������� �������� ����������
		secondVar = c;
		System.out.println("second variable = c = " + secondVar);
			
		System.out.println("first variable = " + firstVar);
		System.out.println("second variable = " + secondVar);
		
	}
	
}

/*������ 2
�������� �������� ���� ����������, ��������� ������ (��������) ����������.
�������
�������� ����������: 
x - ������ ����������;
y - ������ ����������;
b - �������� ���������� (��� �������� �������� ������ ����������).
�������� ������� ������: 
����� �������� ���� ���������� ��������� �� ���������� ���������:
� �������� ���������� ����������� �������� ������ ����������.
������ ���������� ������������� �������� ������.
������ ���������� ������������� �������� �������� ����������, 
��� �������� ����� ������� �������� ������ ����������.*/
