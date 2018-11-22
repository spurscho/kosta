package myjava;

public class ExamMethod {

	/*
	 * 1���� 999������ ���Ǽ� 100���� �̷���� �迭�� �����ϴ� �Լ��� �̿��� �迭�� ���� 
	 * ��. �迭�� ������ �� �ٿ� 10���� ����ϴ� �Լ�, �̶� �� ������ ���� ���������Ѵ�. 
	 * ��. �ε����� Ȧ���� ������ ����ϴ� �Լ�, ��µǴ� ����� ���� ������. 
	 * ��. �迭�� ������ ���� ��ȯ�ϴ� �Լ�
	 * ��. ���� ���� ���� ��ġ(�ε���)�� ��ȯ�ϴ� �Լ� 
	 * ��. 3�� ������� ���ο� �迭�� �����Ͽ� �����ϴ� �Լ�.
	 */

	public static void main(String[] args) {
		int[] list = randomList(); // �迭 ����
		System.out.println("�迭�� ������ �� �ٿ� 10���� ����ϴ� �Լ�, �̶� �� ������ ���� ���������Ѵ�.");
		printList(list);
		System.out.println();System.out.println();
		System.out.print("�ε����� Ȧ���� ������ ����ϴ� �Լ�, ��µǴ� ����� ���� ������.");
		printOddList(list);
		System.out.println();
		System.out.println("�迭�� ������ ���� ��ȯ�ϴ� �Լ� : "+returnListSum(list));
		System.out.println("����Ʈ�� �ּҰ� ��ġ : "+returnMinIndex(list));
		System.out.println("����Ʈ�� 3 ��� �� ");
		int[] trippleList = copyListToTrippleList(list);
		printList(trippleList);
	}

	// ������ ���� ���Ե� int�迭 ����
	private static int[] randomList() {
		int[] resultList = new int[100];
		for (int i = 0; i < resultList.length; i++) {
			resultList[i] = (int) (Math.random() * 999) + 1;
		}
		return resultList;
	}

	// ��. �迭�� ������ �� �ٿ� 10���� ����ϴ� �Լ�
	private static void printList(int[] list) {
		for (int i = 0; i < list.length; i++) {
			if (i % 10 == 0 && i > 1) {
				System.out.println("");
			}
			System.out.printf(" [%2d]%3d", i,list[i]);
		}
	}

	// ��. �ε����� Ȧ���� ������ ����ϴ� �Լ�, ��µǴ� ����� ���� ������.
	private static void printOddList(int[] list) {
		int count=0;
		for (int i = 0; i < list.length; i++) {
			if (i%2!=0) {
				if (count%10==0) {
					System.out.println("");
				}
				System.out.printf(" [%2d]%3d", i,list[i]);
				count++;
			}
		}
	}
	// ��. �迭�� ������ ���� ��ȯ�ϴ� �Լ�
	private static int returnListSum(int[] list) {
		int sum = 0;
		for(int i=0;i<list.length;i++) {
			sum += list[i];
		}
		return sum;
	}
	// ��. ���� ���� ���� ��ġ(�ε���)�� ��ȯ�ϴ� �Լ�
	private static int returnMinIndex(int[] list) {
		int minIndex = 0;
		int temp=list[0];
		
		for(int i=0; i<list.length-1; i++) {
			if(temp>list[i]) {
				temp = list[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
	
	// ��. 3�� ������� ���ο� �迭�� �����Ͽ� �����ϴ� �Լ�.
	private static int[] copyListToTrippleList(int[] list) {
		int sizeCount = 0;
		int[] tempList = new int[list.length];
		
		for(int i=0; i<list.length; i++) {
			if(list[i]%3==0) {
				tempList[sizeCount] = list[i];
				sizeCount++;
			}
		}
		int[] trippleList = new int[sizeCount];
		for(int i=0; i<sizeCount; i++) {
			trippleList[i] = tempList[i];
		}
		return trippleList;
	}
	
	private static int[] makeTrippleList(int[] list) {
	
			int count = 0;
			for(int ele:list) {
				if(ele%3==0) count++;
			}
			
			int[] result = new int[count];
			count = 0;
			for(int ele: list) {
				if(ele%3==0) result[count++] = ele;
			}
			
			return result;
	}
}
