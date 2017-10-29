package homework001;

import java.util.Scanner;

public class task1_6 {

	public static void main(String[] args) {
		// TODO Программа запрашивает у пользователя a,b,c ,

		double a = 0, b = 0, c = 0, p1, p2, p3, p4, u;

		Scanner skk = new Scanner(System.in);

		System.out.print("a: ");
		
		if (skk.hasNextDouble()) {

		a = skk.nextDouble();


		System.out.print("b: ");
			
		if (skk.hasNextDouble()) {

		b = skk.nextDouble();


		System.out.print("c: ");
			
		if (skk.hasNextDouble()) {

		c = skk.nextDouble();

		// вычислить значение выражения a^2-(b-c)^2+ln(b^2+1)
		
		p1 = a*a;
		p2 = b - c;
		p3 = b * b  + 1;
		p4 = Math.log(p3);
	
		
		u = p1 - p2 * p2 + p4;


		System.out.println("unknown=" + u);
		}}}}}
