package myjava;

public class ArrayTest {
	public static void main(String[] args) {
		/*
		 * �迭 : �����ڷ���, �迭ũ�� ����Ұ�
		 * ����, ����, �Ҵ�, ����
		 */
		int[] list;
		int[] list2[];
		//int[10] list3; //����� ������ ������ �� ����.
		list = new int[10];
		//list2 = new int[]; //������ ������ �����ؾ��Ѵ�.
		list[0] = 1000;
		for(int i=0;i<list.length;i++) {
			System.out.println(list[i]);
		}
		for(int temp:list) {
			System.out.println(temp);
		}
		
	}
}
