	import java.util.Scanner;

	public class Task2_2 { //SumAndMul
	
		public static void main(String[] args) {
			int x;
			int y;
			int sum, mul;
			
			x = readXFromConsole();
			y = readYFromConsole();
			sum = calcSum(x, y);
			mul = calcMul(x, y);
			printResult(sum, mul);
		}
			
			public static int readXFromConsole() {
				Scanner conin = new Scanner(System.in);
				int x = 0;
					System.out.println("Введите x: ");
				while(!conin.hasNextInt()) {
					conin.next();
			}
				x = conin.nextInt();
				return x;
			}
			
			public static int readYFromConsole() {
				Scanner conin = new Scanner(System.in);
				int y = 0;
					System.out.println("Введите y: ");
				while(!conin.hasNextInt()) {
					conin.next();
			}
				y = conin.nextInt();
				return y;
			}
			
			public static int calcSum(int x, int y) {
				int sum;
				sum = x + y;
				return sum;
			}

			public static int calcMul(int x, int y) {
				int mul;
				mul = x * y;
				return mul;
			}
			
			public static void printResult(int sum, int mul) {
				
			System.out.println("sum = " + sum + "; mul = " + mul);
		}
	}
