package myjava;

import java.util.Scanner;

public class ExamForLoop2 {

	public static void main(String[] args) {

		/*
		 * ����ڷκ��� 2~9 ������ ���ڸ� �Է¹޴´�. �Ʒ��� ����Ѵ�. 5�� �Է¹�����... 9 89 789 6789 56789
		 */
		Scanner sc = new Scanner(System.in);
		while(true) {
			int input = sc.nextInt();
			if(input>=2 && input<=9) {
				System.out.println(input + "�� �Է¹�����...");
				for (int i = 9; i >= input; i--) {
					for (int j = i; j <= 9; j++) {
						System.out.print(j);
					}
					System.out.println("");
				}
				break;
			}else{
				System.out.println("2~9������ ���ڸ� �Է��ϼ���!");
			}
		}
	}
}
