package project;

import java.lang.Math;

public class task3_2_1 {

	public static void main(String[] args) {
		int k = 10; // длина массива
		int kd = 2; // длина второго измерения массива

		int[][] fraction = new int[k][kd];

		fraction = fillFractionArray(fraction);

		printArray(fraction);
	}

	public static void printArray(int[][] fraction) {
		for (int i = 0; i < fraction.length; i++) {
			for (int j = 0; j < fraction[i].length; j++) {

			}
			System.out.println(fraction[i][0] + "/" + fraction[i][1]);
		}
	}

	public static int[][] fillFractionArray(int[][] fraction) {
		for (int i = 0; i < fraction.length; i++) {
			for (int j = 0; j < fraction[i].length; j++) {
				fraction[i][j] = (int) (1 + Math.random() * 10);
			}

		}
		return fraction;
	}
}
