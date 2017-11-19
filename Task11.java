package by.http.lesson3;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Task11 {
	
	public static void main(String[] args) {
		
		double myCollect[] = { 327, 381, 891, 918, 212, 848, 770, 363, 416, 736 };
		double max = myCollect[0];
		
		//print initial collection
		for (int i = 0; i < myCollect.length; i++)
			System.out.print(myCollect[i] + " ");
		
		System.out.println(" ");
		
		//find max element in collection
		for(int i = 0; i < myCollect.length; i++){
			if (max < myCollect[i])
				max = myCollect[i];
			
		}
		
		System.out.println("Max = " + max);
		
		//divide all collection elements by max element
		//print result
		for(int i = 0; i < myCollect.length; i++) {
			double res;
			res = myCollect[i] / max;
//			Object <- Format <- NumberFormat <- DecimalFormat API hierarchy
			NumberFormat formatter = new DecimalFormat("#0.00");
			System.out.print(formatter.format(res) + " ");
			
		}
		
	}

}

//Задача 11
//Все элементы массива поделить на значение наибольшего элемента этого массива.

//Решение
//Задача состоит из двух подзадач:
//1) Поиск максимума.
//2) Деление на него элементов массива.

//Исходный массив:  327 381 891 918 212 848 770 363 416 736
//Максимум: 918
//Частные:   0.36  0.42  0.97  1.00  0.23  0.92  0.84  0.40  0.45  0.80

