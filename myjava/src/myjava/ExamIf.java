package myjava;

import java.util.Calendar;

public class ExamIf {

	public static void main(String[] args) {
		
		// 오늘이 주중인가 주말인가에 따라 문자열을 출력.
		// 주중이면 열심히 공부합시다.
		// 주말이면 쫌 쉽시다.
		
		int today;
		today = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
		
		if(today==Calendar.SUNDAY || today==Calendar.SATURDAY) { //1 = 일요일, 7 = 토요일
			System.out.println("쫌 쉽시다.");
		}else {
			System.out.println("열심히 공부합시다.");
		}

	}

}
