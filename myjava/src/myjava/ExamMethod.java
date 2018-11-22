package myjava;

public class ExamMethod {

	/*
	 * 1부터 999까지의 임의수 100개로 이루어진 배열을 생성하는 함수를 이용해 배열을 생성 
	 * ㄱ. 배열의 수들을 한 줄에 10개씩 출력하는 함수, 이때 각 수들은 줄이 맞춰져야한다. 
	 * ㄴ. 인덱스가 홀수인 수들을 출력하는 함수, 출력되는 방식은 ㄱ와 동일함. 
	 * ㄷ. 배열의 수들의 합을 반환하는 함수
	 * ㄹ. 가장 작은 수의 위치(인덱스)를 반환하는 함수 
	 * ㅁ. 3의 배수만을 새로운 배열에 복사하여 리턴하는 함수.
	 */

	public static void main(String[] args) {
		int[] list = randomList(); // 배열 생성
		System.out.println("배열의 수들을 한 줄에 10개씩 출력하는 함수, 이때 각 수들은 줄이 맞춰져야한다.");
		printList(list);
		System.out.println();System.out.println();
		System.out.print("인덱스가 홀수인 수들을 출력하는 함수, 출력되는 방식은 ㄱ와 동일함.");
		printOddList(list);
		System.out.println();
		System.out.println("배열의 수들의 합을 반환하는 함수 : "+returnListSum(list));
		System.out.println("리스트의 최소값 위치 : "+returnMinIndex(list));
		System.out.println("리스트의 3 배수 값 ");
		int[] trippleList = copyListToTrippleList(list);
		printList(trippleList);
	}

	// 임의의 수가 삽입된 int배열 정의
	private static int[] randomList() {
		int[] resultList = new int[100];
		for (int i = 0; i < resultList.length; i++) {
			resultList[i] = (int) (Math.random() * 999) + 1;
		}
		return resultList;
	}

	// ㄱ. 배열의 수들을 한 줄에 10개씩 출력하는 함수
	private static void printList(int[] list) {
		for (int i = 0; i < list.length; i++) {
			if (i % 10 == 0 && i > 1) {
				System.out.println("");
			}
			System.out.printf(" [%2d]%3d", i,list[i]);
		}
	}

	// ㄴ. 인덱스가 홀수인 수들을 출력하는 함수, 출력되는 방식은 ㄱ와 동일함.
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
	// ㄷ. 배열의 수들의 합을 반환하는 함수
	private static int returnListSum(int[] list) {
		int sum = 0;
		for(int i=0;i<list.length;i++) {
			sum += list[i];
		}
		return sum;
	}
	// ㄹ. 가장 작은 수의 위치(인덱스)를 반환하는 함수
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
	
	// ㅁ. 3의 배수만을 새로운 배열에 복사하여 리턴하는 함수.
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
