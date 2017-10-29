import java.util.Scanner;

public class task2_2_2 { //WithStrings
	public static void main(String[] args) {
		String month;
		int year;
		int numDays = 0;
		
		month = readMonthFromConsole("Введите месяц");
		year = readYearFromConsole();
		numDays = findNumDays(month, year);
		printResult(numDays);
	}

	private static String readMonthFromConsole(String string) {
		Scanner sc = new Scanner(System.in);
		String month;
		
		System.out.print(string + ": ");
		month = sc.next();
		return month;
	}
	private static int readYearFromConsole() {
		Scanner sc = new Scanner(System.in);
		int year;
		
		System.out.print("Введите год: ");
		year = sc.nextInt();
		return year;
	}
	
		public static int findNumDays(String month, int year) {
			
			int numDays;
		
		switch (month) {
		
		case "March":
		case "May":
		case "July":
		case "August":
		case "October":
		case "December":
			numDays = 31;
			break;
		case "April":
		case "June":
		case "September":
		case "November":
			numDays = 30;
			break;
		case "February":
			if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
				numDays = 29;
			else
				numDays = 28;
			break;
		default:
			numDays = 0;
			break;
		}
		
		return numDays;
			
			
		}
		public static void printResult(int numDays) {
		System.out.println("Число дней = " + numDays);
		}
	}


