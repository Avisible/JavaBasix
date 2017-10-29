import java.util.Scanner;

public class task2_2_3 {

	public static void main(String[] args) {
		
		String monthInt;
		String season;
		
		System.out.print("Введите месяц цифрой: ");
		Scanner sc = new Scanner(System.in);
		monthInt = sc.next();
		
		Integer month = Integer.valueOf(monthInt);
		
		season = findSeason(month);
		
		System.out.println("Этот месяц принадлежит " + season);
		
	}
	
	private static String findSeason(int month) {
		
		String season = null;
		
		switch (month){
		case 12:			
		case 1:
		case 2:
			season = "Winter";
			break;	
		case 3:
		case 4:				
		case 5:
			season = "Spring";
			break;
		case 6:	
		case 7:
		case 8:
			season = "Summer";
			break;				
		case 9:	
		case 10:
		case 11:				
			season = "Autumn";
			break;
		}
	return season;
	}
}
		
		
	
