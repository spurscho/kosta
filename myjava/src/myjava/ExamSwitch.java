package myjava;


public class ExamSwitch {

	public static void main(String[] args) {
		// 1~100������ �������� �߻� �� ���ڿ� �ش��ϴ� ���� ���.
		int random = (int) (Math.random()*100)+1;
		
		String grade = "F";
		
		switch(random/10) {
		case 10:
		case 9:
			grade = "A";break;
		case 8:
			grade = "B";break;
		case 7:
			grade = "C";break;
		case 6:
			grade = "D";break;
		default:
			break;
		}
		
		System.out.printf("����: %d, ����: %s\n", random, grade);
		
		
		/*char result;
		if(random>=90) {
			result = 'A';
		}else if(random>=80) {
			result = 'B';
		}else if(random>=70) {
			result = 'C';
		}else if(random>=60) {
			result = 'D';
		}else {
			result = 'F';
		}
		switch(result) {
			case 'A':
				System.out.println("A");
				break;
			case 'B':
				System.out.println("B");
				break;
			case 'C':
				System.out.println("C");
				break;
			case 'D':
				System.out.println("D");
				break;
			default:
				System.out.println("F");
				break;
		}*/
	}
	
}
