package by.http.lesson3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.ArrayList;

public class Task8 {
	
	public static void main(String[] args) throws Exception{
		
		//��������� ����� �� ����������� ������, ����������� ����������� ������
		//for top efficiency BufferedReader is used with InputStreamReader
		//BufferedReader - ��� ��� ����������, myInput - ��� ��� ����������
		BufferedReader myInput = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number:");
		//readLine() - ����� �� BufferedReader ������; ��������� ����� ������ ��� �����
		//parseInt() - ����������� ����� � �����: ����� �������� (string) "2" -> (int) 2
		//(myInput.readLine() - ��������, �.�. �� ��� �� ������ � ����� ����� ����������
		int a = Integer.parseInt(myInput.readLine());
		//<Integer> - ��� ������� ��������
		
		ArrayList<Integer> array = new ArrayList<>();
		
		//� ���� ����� array "����������������"(�.�. ����� �� �� ������ "360", � ����� ����� ������ "063")
		while (a >= 1) {
			int one = a % 10;
			array.add(one);
			a = a / 10;
		}
		
		//�������� ������ ������� add(), ����������� � ���� ������� get(), ����������� �������������� ��� ��, ��� ��� ��������, �� ��� ���������� ������
		System.out.println("Enter a digit:");
		
		int digit = Integer.parseInt(myInput.readLine());
		
		int count = 0;
		
		//� ������� ������� ������������ ����� length, � arrayList - size
		//� ���� ����� ������� ��������� digit
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i) == digit) {
				array.remove(i);
				i--;
				count++;
			}
		}
		
		if (count == 0) {
			System.out.println("Entered digit is not within entered number!");
		}
		
		for(int i = array.size()-1; i >= 0; i--) {
			System.out.print(array.get(i));
		}
		
		
	}

}

/*������ 8
�� ������������ ����� ������� �������� �����. ����� � ����� ������� � ����������.
��������, ������ ����� 5683. ��������� ������� �� ���� ����� 8. ��������� ����� 563.

�������
������ ����������� ���, ��� ������� ���������� ���������� �������� �����. 
������� �������� ����� ����� ������ ��������� � ����� � ������� ��������� mod (���������� ������� �� �������). 
������ ���� �� 10, ����� �������� ��������� ����� �����.
���� ��������� ����� �� ��������� � ������, ������� ��������� �������, 
�� �� ���� ��������� � ������ �����, ����� ���� ������� ��� �������. 
����� �����������, ����� ����� ����� ������������� ��������: ������� ������� ��������� ����� ��������.
����� ����, ��� �������� ���� ����� �������, ����� ����� ����������������.
������ ���������� ���������:
38012732
3
801272*/