import java.util.Scanner;

public class tast1_2_3 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		int N = 0;
		int buffer = 0;
		int matchReq = 0;

		System.out.print("введите количество чисел которые программа запросит для манипуляций:");
		if (read.hasNextInt()) 
			N = read.nextInt();
		
		for (int i=0; i<N; i++) {
			System.out.println("введите некоторое вещественное число:");
			if (read.hasNextDouble()) 
				buffer = (int)read.nextDouble();
			
			if ((buffer % 2 == 0) && (buffer > 15)) {
				matchReq = matchReq + 1;
			}
			}		
		System.out.print("matchReq: " + matchReq);
	}

}
