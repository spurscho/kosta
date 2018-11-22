package myjava;

import java.util.Random;

public class ExamArray {

	public static void main(String[] args) {
		/*
		 * 1부터 45까지의 임의정수 6개를 배열에 저장 배열에 저장된 정수값을 출력
		 */
		int random = 0;
		int[] list = new int[6];

		for (int i = 0; i < list.length; i++) {
			random = (int) (Math.random() * 45) + 1;
			// 중복여부를 체크한다.
			while (isDuplicate(random, list)) {
				random = (int) (Math.random() * 45) + 1;
			}
			list[i] = random;
		}

		for (int temp : list) {
			System.out.print(temp + " ");
		}
	}

	public static boolean isDuplicate(int random, int[] list) {
		for (int element : list) {
			if (element == random) {
				return true;
			}
		}
		return false;
	}

}
