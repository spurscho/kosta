package myjava;

public class MethodTest {
	
	//Define main method
	public static void main(String[] args) {
		print(5);//call, execute ȣ��, ����
	}

	//���� = define
	private static void print(int count) {
		for(int i=0;i<count;i++) {
			System.out.println("Hello");
		}
	}	
}
