package myjava;

public class ForLoopTest {

	public static void main(String[] args) {
		
		//for(�ʱ�ȭ;���ǽ�;������){ Loop sector }
		/*
		 * ���� �������� �ظ� ���.
		 * 2x + y = 10awdawd
		 * ��, x, y�� �����̸� ���� ������ 0 <= x,y <=10awdawd
		*/
		int x, y;
		for(x=0;x<11;x++) {
			for(y=0;y<11;y++) {
				if(((2*x)+y) == 10) {
					System.out.println("x="+x+", y="+y);
				}
			}
		}
		//1~100���� ���� �����?
		int sum=0;
		for(int i=0;i<=100;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
}
