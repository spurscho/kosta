package myjava;

public class CarTest2 {

	public static void main(String[] args) {
		Car2 car = new Car2(); // �����ڰ� ȣ��Ǿ�� �������� ��ü�� �����ȴ�.
		//�����ڴ� ���ǵǾ��ִ� �����ڸ��� ȣ�� �����ϴ�.
		car.name="Mater";
		car.maker = "HD";
		System.out.println(car.maker);
		Car2 car2 = new Car2(300);
		System.out.println(car2.maker); //maker�� static�̶� �޸𸮸� �ϳ��� ����ϹǷ� �Ȱ��� hd�� ���´�.
		car2.maker="BMW";
		System.out.println(car.maker);
		Car2.maker = "Hyundai";
	}
}

class Car2{
    public String name; 
	private int speed; // private : ����������.
	static String maker;
	Car2(){
		System.out.println("�⺻������");
	}
	Car2(int speed){
	}
}
