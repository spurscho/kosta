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
		//�Ҵ��Ѵ� -> ����, ����, ����, ���
		//1. int amount
		//2. �����ڴ� ��̰� �װ͵��� �켱����
		// =, ++, +
		// +, ++, = -> �켱����
		
		System.out.println(8 << 3);
		System.out.println(8 >> 4);
		
	}
}