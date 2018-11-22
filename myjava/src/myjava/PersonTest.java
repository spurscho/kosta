package myjava;

public class PersonTest {

	public static void main(String[] args) {
		Person.numberOfPersons = 0;
		Person chul = new Person(3, "ö��");
		chul.selfIntroduce();
		System.out.println("��ü �α��� : "+chul.getPopulation()+"��");
		Person ki = new Person(27, "����");
		ki.selfIntroduce();
		System.out.println("��ü �α��� : "+ki.getPopulation()+"��");
		Person anonymous = new Person();
		anonymous.selfIntroduce();
		System.out.println("��ü �α��� : "+anonymous.getPopulation()+"��");
	}
}

class Person {
	static int numberOfPersons;
	int age;
	String name;

	Person() {
		age = 12;
		name = "Anonymous";
		numberOfPersons++;
	}

	Person(int age, String name) {
		this.age = age;
		this.name = name;
		numberOfPersons++;
	}
	
	public void selfIntroduce() {
		System.out.println("�� �̸��� "+this.name+"�̸�, ���̴� "+this.age+"�� �Դϴ�.");
	}
	
	public int getPopulation() {
		return numberOfPersons;
	}
}




