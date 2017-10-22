package by.http.lesson3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.ArrayList;

public class Task8 {
	
	public static void main(String[] args) throws Exception{
		
		//считывает текст из символьного потока, буферизирую прочитанные сиволы
		//for top efficiency BufferedReader is used with InputStreamReader
		//BufferedReader - это тип переменной, myInput - это имя переменной
		BufferedReader myInput = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number:");
		//readLine() - метод из BufferedReader класса; считывает новую строку или текст
		//parseInt() - преобразует сроку в число: ввели например (string) "2" -> (int) 2
		//(myInput.readLine() - параметр, т.е. то что мы введем и будет нашим параметром
		int a = Integer.parseInt(myInput.readLine());
		//<Integer> - тип будущих объектов
		
		ArrayList<Integer> array = new ArrayList<>();
		
		//в этом цикле array "переворачивается"(т.е. ввели мы на пример "360", а после цикла станет "063")
		while (a >= 1) {
			int one = a % 10;
			array.add(one);
			a = a / 10;
		}
		
		//вставьте объект методом add(), обращайтесь к нему методом get(), используйте индексирование так же, как для массивов, но без квадратных скобок
		System.out.println("Enter a digit:");
		
		int digit = Integer.parseInt(myInput.readLine());
		
		int count = 0;
		
		//в обычном массиве используется метод length, в arrayList - size
		//в этом цикле удаляем введенный digit
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

/*Задача 8
Из натурального числа удалить заданную цифру. Число и цифру вводить с клавиатуры.
Например, задано число 5683. Требуется удалить из него цифру 8. Получится число 563.

Решение
Задача усложняется тем, что заранее неизвестно количество разрядов числа. 
Поэтому исходное число проще начать проверять с конца с помощью оператора mod (нахождения остатка от деления). 
Делить надо на 10, чтобы получить последнюю цифру числа.
Если последняя цифра не совпадает с цифрой, которую требуется удалить, 
то ее надо перенести в другое число, перед этим сдвинув его разряды. 
Легче реализовать, чтобы новое число формировалось наоборот: старшие разряды исходного будут младшими.
После того, как заданная цифр будет удалена, число снова переворачивается.
Пример выполнения программы:
38012732
3
801272*/