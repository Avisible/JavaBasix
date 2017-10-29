import java.util.Scanner;

public class task1_2_6 {

	public static void main(String[] args) {
	
		Scanner read = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		
		double result = 0;
		double result2 = 0;
		
		System.out.print("введите a:");
		if (read.hasNextInt()) 
			a = read.nextInt();
		
		System.out.print("введите b:");
		if (read.hasNextInt()) 
			b = read.nextInt();
		
		System.out.print("введите c:");
		if (read.hasNextInt()) 
			c = read.nextInt();
		
		System.out.print("введите d:");
		if (read.hasNextInt()) 
			d = read.nextInt();
		
		result = b+(Math.sqrt(b*b+4*a*c))/2*a - (Math.pow(a,3)*c) + b;
		
		result2 = (a/c)*(b/d)-((a*b-c)/(c*d));
		
		System.out.println("Результат вычисления 1 :" + result);
		System.out.println("Результат вычисления 2 :" + result2);

	}

}
