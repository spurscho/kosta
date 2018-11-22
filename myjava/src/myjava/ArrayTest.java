package myjava;

public class ArrayTest {
	public static void main(String[] args) {
		/*
		 * 배열 : 동일자료형, 배열크기 변경불가
		 * 선언, 생성, 할당, 참조
		 */
		int[] list;
		int[] list2[];
		//int[10] list3; //선언시 개수를 지정할 수 없다.
		list = new int[10];
		//list2 = new int[]; //생성시 개수를 지정해야한다.
		list[0] = 1000;
		for(int i=0;i<list.length;i++) {
			System.out.println(list[i]);
		}
		for(int temp:list) {
			System.out.println(temp);
		}
		
	}
}
