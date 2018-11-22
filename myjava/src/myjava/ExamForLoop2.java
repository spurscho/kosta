package myjava;

import java.util.Scanner;

public class ExamForLoop2 {

	public static void main(String[] args) {

		/*
		 * 사용자로부터 2~9 사이의 숫자를 입력받는다. 아래를 출력한다. 5를 입력받으면... 9 89 789 6789 56789
		 */
		Scanner sc = new Scanner(System.in);
		while(true) {
			int input = sc.nextInt();
			if(input>=2 && input<=9) {
				System.out.println(input + "를 입력받으면...");
				for (int i = 9; i >= input; i--) {
					for (int j = i; j <= 9; j++) {
						System.out.print(j);
					}
					System.out.println("");
				}
				break;
			}else{
				System.out.println("2~9사이의 숫자를 입력하세욧!");
			}
		}
	}
}
