import java.util.Scanner;

public class massInt {

	public static void main(String[] args) {
		// В массив A [N] занесены натуральные числа.
		// Найти сумму тех элементов, которые кратны данному К

		int N = 0; // переменная равная числу элементов в массиве
		int[] A; // объявляется массив А
		int K = 0; // кратное
		int sum = 0; // сумма значений элементов кратных К

		N = readArrayLength();
		A = new int[N];
		readArrayElements(A);
		K = readModK();
		calcSumModK(A, K);
	}

	public static int readArrayLength() {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("введите длину массива : ");
		int N = sc1.nextInt();
		System.out.println("длинна массива введена");
		return N;
	}

	public static void readArrayElements(int[] A) {
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Начало заполнения массива значениями");
		for (int i = 0; i < A.length; i++) {
			System.out.print("A[" + i + "]=>");
			A[i] = sc2.nextInt();
		}
	}

	public static int readModK() {
		Scanner sc3 = new Scanner(System.in);
		System.out.println("введите кратное : ");
		int K = sc3.nextInt();
		return K;
	}

	public static void calcSumModK(int[] A, int K) {
		int sum = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] % K == 0) {
				sum = sum + A[i];
			}
		}
		System.out.println("Сумма значений массива кратных "+ K + " равна " + sum);
	}
}
