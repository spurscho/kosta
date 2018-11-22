package myjava;

public class CarTest {

	public static void main(String[] args) {
		Car hudson = new Car();
		Car carrera = new Car();
		Car mater = new Car();
		Car mcqueen = new Car();
		
		
		hudson.setName("Doc Hudson");
		hudson.setSpeed(300);
		System.out.println(hudson);
		carrera.setName("Sally Carrera");
		carrera.setSpeed(200);
		System.out.println(carrera);
		mater.setName("Mater");
		mater.setSpeed(80);
		System.out.println(mater);
		mcqueen.setName("Lightning Mcqueen");
		mcqueen.setSpeed(300);
		System.out.println(mcqueen);
	}
}

class Car{
    public String name; 
	private int speed;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSpeed() {
		return this.speed;
	}
	@Override
	public String toString() {
		return "name: "+this.name+", speed: "+this.getSpeed();
	}
}
