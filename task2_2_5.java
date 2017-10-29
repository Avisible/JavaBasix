import java.util.Scanner;

public class task2_2_5 {

	public static void main(String[] args) {
		
		String first;
		String second;
		
		System.out.print("введите первую строку: ");
		Scanner sc1 = new Scanner(System.in);
		first = sc1.next();
		
		System.out.print("введите вторую строку: ");
		Scanner sc2 = new Scanner(System.in);
		second = sc2.next();
		
		if (first.equals (second)) { // возвратит true если ввести одинаковые строки, потому что провка идет по содержимому и оно тут одинаковое
			System.out.println("first equals second");
		} else {
			System.out.println("first does not equal second");
		}
		if (first == second) { // возвратит false если ввести так же одинаковые строки, потому что проверяется по ссылкам. Ссылки указывают на разные обьекты 
								// разные они потому, что мы инициировали сканер дважды. Раз ссылки указывают на разные обьекты значит ссылки не равны.
								
			System.out.println("first == second");
		} else {
			System.out.println("first <> second");
		}

	}

}
