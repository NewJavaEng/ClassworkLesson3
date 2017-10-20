package by.http.lesson3;

public class Task2 {
	
	public static void main(String[] args) {
		int firstVar = 3;
		int secondVar = 15;
		int c;//буферная переменная
		
		//В буферной переменной сохраняется значение первой переменной
		c = firstVar;
		System.out.println("c = first variable = " + c);
			
		//Первой переменной присваивается значение второй
		firstVar = secondVar;
		System.out.println("first variable = second variable = " + firstVar);
			
		//Второй переменной присваивается значение буферной переменной
		secondVar = c;
		System.out.println("second variable = c = " + secondVar);
			
		System.out.println("first variable = " + firstVar);
		System.out.println("second variable = " + secondVar);
		
	}
	
}

/*Задача 2
Обменять значения двух переменных, используя третью (буферную) переменную.
Решение
Описание переменных: 
x - первая переменная;
y - вторая переменная;
b - буферная переменная (для хранения значения другой переменной).
Алгоритм решения задачи: 
Обмен значений двух переменных протекает по следующему алгоритму:
В буферной переменной сохраняется значение первой переменной.
Первой переменной присваивается значение второй.
Второй переменной присваивается значение буферной переменной, 
это значение равно старому значению первой переменной.*/
