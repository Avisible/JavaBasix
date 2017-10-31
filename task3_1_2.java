import java.util.ArrayList;

public class task3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] initArray = { 2, 0, 3, 1, 0 }; // создание массива целочисленной последовательности с нулевыми элементами

		int size = zeroCount(initArray);

		int[] withZeroArray;
		withZeroArray = fillInZeroArray(initArray, size);

		System.out.print("\nВывод элементов массива withZeroArray: ");
		for (int i = 0; i < withZeroArray.length; i++) {
			System.out.print(withZeroArray[i] + " ");
		}
	}

	public static int zeroCount(int[] initArray) { // метод для поиска нулей в массиве initArray
		int count = 0;
		for (int i = 0; i < initArray.length; i++) {
			if (initArray[i] == 0) {
				count = count + 1;
			}
		}
		return count;
	}

	public static int[] fillInZeroArray(int[] initArray, int size) {
		int[] withZeroArray = new int[size];
		int k = 0;
		for (int i = 0; i < initArray.length; i++) {
			if (initArray[i] == 0) {
				withZeroArray[k] = i;
				k++;
			}

		}

		return withZeroArray;

	}

}
