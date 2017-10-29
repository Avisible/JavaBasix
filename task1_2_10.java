import java.util.Scanner;

public class task1_2_10 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		double x = 0;		
		double Fx = 0;
		double parameter = -3;
		
		System.out.print("введите x:");
		if (read.hasNextDouble()) 
			x = read.nextDouble();
		
		if (x <= parameter) {
			Fx = 9;
		System.out.println(Fx);
		}
		else if (x>3) {
			Fx = 1/(x*x+1);
		System.out.println(Fx);
		}
		else 
			System.out.println("Введенное значение не входит в границы допустимых значений функции");
			
	}

}
