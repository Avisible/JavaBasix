package homework001;

public class task1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a, b; 	//cathetus
		double c = 0; 	//hypothenuse
		double s; 		//square

		a = 10;			//put a cathetus here

		b = 20;			//put b cathetus here

		c = Math.sqrt(a * a + b * b);

		s = 0.5 * a * b;

		System.out.println("hypothenuse = " + c);
		System.out.println("square = " + s);


	}

}
