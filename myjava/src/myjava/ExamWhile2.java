package myjava;

import java.util.Scanner;

public class ExamWhile2 {

	public static void main(String[] args) {
		// ����ڷκ��� ���ڿ��� �Է¹޾Ƽ� ù ������ �ƽ�Ű���� ���ڸ� ����մϴ�.
		// ����ڰ� �Է������ʰ� ���͸� ġ�� ���α׷��� ���������� ��� �ݺ��ؾ� �մϴ�.
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("�����Է�: ");
			String str = scan.nextLine();
			if (str != null && str.length() > 0) {
				try {

					char firstChar = str.charAt(0);
					System.out.println("�ƽ�Ű��: " + (int) firstChar + ", ���� : " + firstChar);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		}
	}
}
