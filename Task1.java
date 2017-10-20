package by.http.lesson3;

public class Task1 {
	
	public static void main(String[] args) {
		
		int a = 0;//Начальное значение диапазона - "от"
		int b = 900;//Конечное значение диапазона - "до"
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
		
		//Чтобы извлечь из числа цифру сотен надо его разделить нацело на 100
		//например: 352 / 100 = 3.52 (т.к. это у нас int он отбрасывает остаток, берет только 3)
		firstDigit = (c / 100);
		System.out.println("1st digit: " + firstDigit);
		
		//Для получения цифры десяток можно сначала разделить нацело на 10, а затем найти остаток от деления на 10
		//например: 352 / 10 = 35.2 (т.к. это у нас int он отбрасывает остаток, берет только 32)
		//35 / 10 = 3.5 - остаток от деления на 10 равен 5
		secondDigit = (c / 10) % 10;
		System.out.println("2nd digit: " + secondDigit);
		
		//Единицы извлекаются путем нахождения остатка от деления числа на 10
		//352 / 10 = 35.2 - отстаток от деления на 10 равено 2
		thirdDigit = c % 10;
		System.out.println("3rd digit: " + thirdDigit);
		
		multiplicationOfThreeDigits = firstDigit * secondDigit * thirdDigit;
		System.out.println("Multiplication of three digits: " + multiplicationOfThreeDigits);
		
		summOfThreeDigits = firstDigit + secondDigit + thirdDigit;
		System.out.println("Summ of three digits: " + summOfThreeDigits);
		
	}
	
}

/*Задача 1
Сгенерировать случайное число, вывести на экран это число, 
а также сумму и произведение его цифр.

Алгоритм решения задачи: 
random(900) генерирует случайное число от 0 до 899. 
Если прибавить к нему 100, то получится диапазон от 100 до 999 включительно, 
т. е. охватывает все трехзначные числа.
Чтобы извлечь из числа цифру сотен надо его разделить нацело на 100.
Для получения цифры десяток можно сначала разделить нацело на 10, 
а затем найти остаток от деления на 10.
Единицы извлекаются путем нахождения остатка от деления числа на 10.*/

