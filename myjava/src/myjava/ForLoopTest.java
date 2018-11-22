package myjava;

public class ForLoopTest {

	public static void main(String[] args) {
		
		//for(초기화;조건식;증감식){ Loop sector }
		/*
		 * 다음 방정식의 해를 출력.
		 * 2x + y = 10awdawd
		 * 단, x, y는 정수이며 값의 범위는 0 <= x,y <=10awdawd
		*/
		int x, y;
		for(x=0;x<11;x++) {
			for(y=0;y<11;y++) {
				if(((2*x)+y) == 10) {
					System.out.println("x="+x+", y="+y);
				}
			}
		}
		//1~100까지 더한 결과는?
		int sum=0;
		for(int i=0;i<=100;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
}
