package myjava;


public class Hello {

	public static void main(String[] args) {
		
		Member mb = new Member();
		mb.print();
		
	}

	
}

class Member extends Sample{

	@Override
	void print() {
		System.out.println("haha");
		
	}
	
}
abstract class Sample {
	abstract void print();
}