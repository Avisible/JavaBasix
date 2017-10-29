import java.util.ArrayList;

public class task3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] initArray = { 2, 0, 3, 1, 0 }; // создание массива целочисленной последовательности с нулевыми элементами
		int count = 0; // промежуточная переменная для хранения количества нулей найденных в массиве
						// initArray
		int size = zeroCount(initArray, count);
		// System.out.println("новый массив будет содержать " + size + " элемента");
		// это нужно для дебага
		int[] withZeroArray = new int[size];
		withZeroArray = fillInZeroArray(initArray, size);

		System.out.print("\nВывод элементов массива withZeroArray: ");
		for (int i = 0; i < withZeroArray.length; i++) {
			System.out.print(withZeroArray[i] + " ");
		}

	}

	public static int zeroCount(int[] initArray, int count) { // метод для поиска нулей в массиве initArray
		for (int i = 0; i < initArray.length; i++) {
			if (initArray[i] == 0) {
				count = count + 1;
			}
		}
		return count;
	}

	public static int[] fillInZeroArray(int[] initArray, int size) {
		int[] result = new int[size];
		for (int i = 0; i < initArray.length; i++) {
			if (initArray[i] == 0) {
				int j = 0;
				result[j] = i;
				System.out.println(result[j]);
				j++;
			}

		}

		return result;

	}

}
