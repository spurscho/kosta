package myjava;

public class ExamWhile {
	
	public static void main(String[] args) {
		/*	1+2+3+4+...+n
		 * �󸶱��� �����ؾ� �鸸�� �ʰ��ұ�?
		*/
		/*int count = 0; //ī��Ʈ
		int result = 1; //��
		
		while(result<=1000000) {
			count++; //ī��Ʈ �ø���
			result += count; //ī��Ʈ�� ����� ��
		}
		System.out.println("count : "+count);
		System.out.println("result : "+result);*/
		
		int count=0;
		int sum=0;
		while(sum<=1000000) {
			count++;
			sum+=count;
		}
		System.out.println("�鸸�� �ʰ��ϴ� �������� "+count+", �׶��� ��������� "+sum);
	}
}
