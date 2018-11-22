package myjava;

import java.util.Random;

public class ExamArray {

	public static void main(String[] args) {
		/*
		 * 1���� 45������ �������� 6���� �迭�� ���� �迭�� ����� �������� ���
		 */
		int random = 0;
		int[] list = new int[6];

		for (int i = 0; i < list.length; i++) {
			random = (int) (Math.random() * 45) + 1;
			// �ߺ����θ� üũ�Ѵ�.
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
