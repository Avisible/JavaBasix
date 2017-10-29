import java.util.Scanner;

public class task1_2_5 {

	public static void main(String args[]) {

		int sum = 0;
		int prod = 1;
		for (int i = 0; i < args.length; i++) {
			int parseResult = Integer.parseInt(args[i]);
			sum = sum + parseResult;
			prod = prod * parseResult;
		}
		System.out.println("sum = " + sum);
		System.out.println("prod = " + prod);
	}

}
