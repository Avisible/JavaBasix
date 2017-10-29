public class task1_2_7 {

	public static void main(String[] args) {

		int a = 1;
		int b = -2;
		int c = 3;
		
		if ( a >= 0 ) {
			a = a*a;
		} else {
			a = (int) Math.pow(a, 4);
		}
		
		if ( b >= 0 ) {
			b = b*b;
		} else {
			b = (int) Math.pow(b, 4);
		}
		
		if ( c >= 0 ) {
			c = c*c;
		} else {
			c = (int) Math.pow(c, 4);
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	

}
