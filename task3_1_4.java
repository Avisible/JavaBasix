
public class task3_1_4 {

	public static void main(String[] args) {

		int[] initArray = { 1, 1, 3, 1, 5, 7, 9 };
		
		int size = countSymmetricItems(initArray);   //System.out.println(size);
		
		int[] withSymmetricArray = buildSymmetricArray(initArray, size);
		
		if (size == 0) {
			
			System.out.println("В испытуемом массиве нет четных чисел");
			
		} else {
			
			System.out.print("Вывод четных элементов массива initArray: ");
			for (int i = 0; i < withSymmetricArray.length; i++) 
				System.out.print(withSymmetricArray[i] + ", ");
		}
	}

	public static int countSymmetricItems(int[] initArray) { // метод для поиска четных чисел в массиве initArray
		int count = 0;
		for (int i = 0; i < initArray.length; i++) {
			if (initArray[i] % 2 == 0) {
				count = count + 1;
			}
		}
		return count;
	}

	public static int[] buildSymmetricArray(int[] initArray, int size) {
		int[] symmetricArray = new int[size];
		int k = 0;
		for (int i = 0; i < initArray.length; i++) {
			if (initArray[i] % 2 == 0) {
				symmetricArray[k] = i;
				k++;
			}

		}

		return symmetricArray;

	}

}
