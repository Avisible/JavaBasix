import java.util.Scanner;

public class task1_2_2 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		int a = 0;
		int buffer = 0;
		int even = 0;
		int divisibleByThree = 0;
		int absolute = 0;
		
		System.out.print("введите количество чисел которые программа запросит для манипуляций:");
		if (read.hasNextInt()) 
			a = read.nextInt();
		
		for (int i=0; i<a; i++) {
			System.out.print("введите некоторое число:");
			if (read.hasNextInt()) 
				buffer = read.nextInt();
			
			if	((buffer % 3) == 0) {
				divisibleByThree = divisibleByThree + 1;	
			}
			if	(Math.abs(buffer) <3) {
				absolute = absolute + 1;	
			}
			if	 ((buffer % 2) == 0){
				even = even + 1;
			}
	
			
		}
		System.out.println("even:" + even);
		System.out.println("divisibleByThree:" + divisibleByThree);
		System.out.println("absolute:" + absolute);

	}

}
