package myjava;

public class OperatorTest2 {

	public static void main(String[] args) {
		
		//++,--
		int count = 5000;
		System.out.println("count = "+count);
		int amount = count++ + count++;
		System.out.println("amount = "+amount);
		System.out.println("count = "+count);
		// 1. 5000
		// 2. count = count + 1
		// 3. 5000 + 5001
		// 4. amount = 10001
		//할당한다 -> 쓴다, 기입, 저장, 기록
		//1. int amount
		//2. 연산자는 몇개이고 그것들의 우선순위
		// =, ++, +
		// +, ++, = -> 우선순위
		
		System.out.println(8 << 3);
		System.out.println(8 >> 4);
		
	}
}