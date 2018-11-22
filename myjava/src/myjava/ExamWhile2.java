package myjava;

import java.util.Scanner;

public class ExamWhile2 {

	public static void main(String[] args) {
		// 사용자로부터 문자열을 입력받아서 첫 글자의 아스키값과 문자를 출력합니다.
		// 사용자가 입력하지않고 엔터를 치면 프로그램을 종료하지만 계속 반복해야 합니다.
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("문자입력: ");
			String str = scan.nextLine();
			if (str != null && str.length() > 0) {
				try {

					char firstChar = str.charAt(0);
					System.out.println("아스키값: " + (int) firstChar + ", 문자 : " + firstChar);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		}
	}
}
