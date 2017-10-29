import java.util.Scanner;

public class task1_2_8 {

	public static void main(String[] args) {

		// Program pr;
		// uses crt;

		int a;
		int b;
		int x;
		Double y;
		int h;

		System.out.println("Введите a: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();

		System.out.println("Введите b: ");
		Scanner sc1 = new Scanner(System.in);
		b = sc1.nextInt();

		System.out.println("Введите шаг: ");
		Scanner sc2 = new Scanner(System.in);
		h = sc2.nextInt();

		x = a;
		do {
			y = 2 * Math.tan(x * 0.5);
			System.out.print("x= " + x);
			System.out.print(" y= " + y);
			System.out.println();
			 x = x + h;
		} 	while ( x <= b);
	}
}
