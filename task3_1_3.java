
public class task3_1_3 {

	public static void main(String[] args) {

		int[] initArray = { 1, 2, 3, 4, 5 };

		boolean b = analyseArray(initArray);

		System.out.println("Последовательность возрастающия: " + b);
	}

	public static boolean analyseArray(int[] initArray) {

		for (int k = 0; k < initArray.length - 1; k++) {

			if (initArray[k] >= initArray[k + 1]) {
				return false;
			}
		}
		return true;
	}
}
