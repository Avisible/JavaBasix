import java.util.Scanner;

public class task2_2_4 {

	public static void main(String[] args) {
		
		String monthInt;
		String season;
		
		System.out.print("Введите месяц цифрой: ");
		Scanner sc = new Scanner(System.in);
		monthInt = sc.next();
		
		Integer month = Integer.valueOf(monthInt);
		
		season = findSeason(month);
		
		System.out.println("Этот месяц принадлежит :" + season);
		
	}
	
	private static String findSeason(int month) {
		
		String season = null;
		
		if (month == 12 || month == 1 || month == 2) {
			season = "Winter";
		}else
			if (month == 3 || month == 4 || month == 5) {
				season = "Spring";
			}else 
				if (month == 6 || month == 7 || month == 8) {
					season = "Summer";
				}else 
					if (month == 9 || month == 10 || month == 11) {
						season = "Autumn";
					}else {
						season = "Ошибка, такого месяца не существует";
					}
	return season;
	}

	}
