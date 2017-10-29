import java.util.Scanner;

public class task1_2_1 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		
		System.out.print("введите a:");
		if (read.hasNextInt()) 
			a = read.nextInt();
		
		
		System.out.print("введите b:");
		if (read.hasNextInt())
			b = read.nextInt();
		
		if (a==b) {
			System.out.print("Скоро новый год!");
		}	else {
			System.out.print("введите c:");
			if (read.hasNextInt())
				c = read.nextInt();
			System.out.println(a + b + c);
			System.out.println(a * a + b * b);
			System.out.println("моя любимая футбольная команда");
		}



	}

}
