package myjava;

public class PersonTest {

	public static void main(String[] args) {
		Person.numberOfPersons = 0;
		Person chul = new Person(3, "철수");
		chul.selfIntroduce();
		System.out.println("전체 인구수 : "+chul.getPopulation()+"명");
		Person ki = new Person(27, "기현");
		ki.selfIntroduce();
		System.out.println("전체 인구수 : "+ki.getPopulation()+"명");
		Person anonymous = new Person();
		anonymous.selfIntroduce();
		System.out.println("전체 인구수 : "+anonymous.getPopulation()+"명");
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
		System.out.println("내 이름은 "+this.name+"이며, 나이는 "+this.age+"살 입니다.");
	}
	
	public int getPopulation() {
		return numberOfPersons;
	}
}




