package myjava;

public class OperatorTest {

	public static void main(String[] args) {
		// 5/2
		double a = 5.0/20;
		System.out.println(a); // int�� int���� ����� int�̴�.
		
		String str = null;
		print(str);
		System.out.println("��");
	}
	
	private static void print(String str) {
		if(str!=null&&str.length()>0) {
			System.out.println("��");
		};
	}
	
}