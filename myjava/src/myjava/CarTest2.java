package myjava;

public class CarTest2 {

	public static void main(String[] args) {
		Car2 car = new Car2(); // 생성자가 호출되어야 힙영역에 객체가 생성된다.
		//생성자는 정의되어있는 생성자만이 호출 가능하다.
		car.name="Mater";
		car.maker = "HD";
		System.out.println(car.maker);
		Car2 car2 = new Car2(300);
		System.out.println(car2.maker); //maker는 static이라 메모리를 하나만 사용하므로 똑같이 hd가 나온다.
		car2.maker="BMW";
		System.out.println(car.maker);
		Car2.maker = "Hyundai";
	}
}

class Car2{
    public String name; 
	private int speed; // private : 접근한정자.
	static String maker;
	Car2(){
		System.out.println("기본생성자");
	}
	Car2(int speed){
	}
}
