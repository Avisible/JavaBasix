import java.util.Scanner;

public class task1_2_4 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int N = 0; // хранение количества запрашиваемых чисел
		int moreLess = 0; // хранение количества чисел (>15 || <2)
		int divisibleByFive = 0; // хранение количества чисел делящихся на 5 с остатком 4
		int buffer = 0; // буфер для хранения промежуточных значений

		System.out.print("введите количество чисел которые программа запросит для манипуляций:");
		if (read.hasNextInt()) 
			N = read.nextInt();
		
		for (int i=0; i<N; i++) {
			System.out.println("введите некоторое число:");
			if (read.hasNextInt()) 
				buffer = read.nextInt();
			
			if (buffer % 5 == 4)  {
				divisibleByFive = divisibleByFive + buffer;
			}
			
			if ((buffer > 15) || (buffer <2)) {
				moreLess = moreLess + 1;
			}
			
			}		
		System.out.println("было введено чисел >15 || <2 : " + moreLess);
		System.out.println("сумма чисел делящихся на 5 с остатком 4 : " + divisibleByFive);

	}
}

