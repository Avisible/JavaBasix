import java.util.Scanner;

public class task2_2_7 {

	public static void main(String[] args) {

		double[] mas = new double[5];
		enterArrayFromConsole(mas);
		findMaxElementAndIndex(mas);
		findMinElementAndIndex(mas);
		sortArray(mas);

	}

	public static void enterArrayFromConsole(double[] mas) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < mas.length; i++) {
			System.out.print("ar[" + i + "]=>");
			mas[i] = sc.nextDouble();
		}
	}
	
	public static void findMaxElementAndIndex(double[] mas) {
		if (mas.length == 0) {
			return;
		}

		double max = mas[0];
		int index = 0;
		
		for (int i = 1; i < mas.length; i++) {
			if (max < mas[i]) {
				max = mas[i];
				index = i;
			}
		}

		System.out.println("Максимальный элемент " + max + " расположен на позиции " + index + ".");
	}
	
	public static void findMinElementAndIndex(double[] mas) {
		if (mas.length == 0) {
			return;
		}

		double min = mas[0];
		int index = 0;

		for (int i = 1; i < mas.length; i++) {
			if (min > mas[i]) {
				min = mas[i];
				index = i;
			}
		}

		System.out.println("Минимальный элемент " + min + " расположен на позиции " + index + ".");
	}

	public static void sortArray(double[] mas) {
		int minValueIndex = 0;

		for (int i = 0; i < mas.length; i++) {
			minValueIndex = i;

			for (int j = i + 1; j < mas.length; j++) {
				if (mas[j] < mas[minValueIndex]) {
					minValueIndex = j;
				}
			}

			double temp = mas[i];
			mas[i] = mas[minValueIndex];
			mas[minValueIndex] = temp;
		}

	}


}
