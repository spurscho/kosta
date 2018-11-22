package myjava;

public class ExamWhile {
	
	public static void main(String[] args) {
		/*	1+2+3+4+...+n
		 * 얼마까지 누적해야 백만을 초과할까?
		*/
		/*int count = 0; //카운트
		int result = 1; //합
		
		while(result<=1000000) {
			count++; //카운트 올리기
			result += count; //카운트와 결과의 합
		}
		System.out.println("count : "+count);
		System.out.println("result : "+result);*/
		
		int count=0;
		int sum=0;
		while(sum<=1000000) {
			count++;
			sum+=count;
		}
		System.out.println("백만을 초과하는 누적값은 "+count+", 그때의 누적결과는 "+sum);
	}
}
