package myjava;

import java.util.Calendar;

public class ExamIf {

	public static void main(String[] args) {
		
		// ������ �����ΰ� �ָ��ΰ��� ���� ���ڿ��� ���.
		// �����̸� ������ �����սô�.
		// �ָ��̸� �� ���ô�.
		
		int today;
		today = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
		
		if(today==Calendar.SUNDAY || today==Calendar.SATURDAY) { //1 = �Ͽ���, 7 = �����
			System.out.println("�� ���ô�.");
		}else {
			System.out.println("������ �����սô�.");
		}

	}

}
