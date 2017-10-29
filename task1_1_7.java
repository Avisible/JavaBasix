package homework001;

import java.util.Scanner;

public class task1_7 {

	public static void main(String[] args) {
		// Программа вводит два числа a и b,  

		int a = 0, b = 0, c = 0;

		Scanner skk = new Scanner(System.in);

		System.out.print("enter a comparable: ");
		
		if (skk.hasNextInt()) {

		a = skk.nextInt();
		}


		System.out.print("enter b comparable: ");
			
		if (skk.hasNextInt()) {

		b = skk.nextInt();
		}
		
		//Если а=b, то программа печатает слово «Конец».
		if (a==b) {
			
			System.out.println("Конец!");
			
		}
		
		//если а > b, то программа вводит третье число с и находит сумму b+c. 
		
		if (a > b) {
			System.out.print("enter c comparable: ");
			
			if (skk.hasNextInt()) {

				c = skk.nextInt();
			
				int sum1 = b + c;
			
				//System.out.println(sum1);
			}
		}

		//Если а<b, то программа вводит третье число с, находит сумму a+b+c,
		//выводит на экран сумму a+b+c и слова «Новый год!». 
		
		if (a < b) {
			System.out.print("enter c comparable: ");
			
			if (skk.hasNextInt()) {

				c = skk.nextInt();
			
				int sum2 = a+ b + c;
			
				System.out.println(sum2 + " Новый год!");
			}
		}
		
		//System.out.println("Что-то не так!");
	}
			
}


