package myjava;

public class ClassTest {

	public static void main(String[] args) {
		
		//MyClass2타입의 my지역변수 선언. 
		//4바이트 메모리 공간을 할당받은 my라는 이름의 공간으로 객체주소를 저장할 수 있다.
		MyClass2 my;
		
		//객체를 생성해서 my 변수에 삽입한다.
		my = new MyClass2();
		System.out.println("Imawdw");
	}

}

class MyClass2 {
	int count;
	void print() {
		System.out.println("haha");
	}
}
