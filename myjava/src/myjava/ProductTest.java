package myjava;

public class ProductTest {

	public static void main(String[] args) {
		String productName = "아이패드";
		Product product = makeProduct(productName);
		
		System.out.println("제품명: "+product.name);
		System.out.println("가격: "+product.price+"원");
		System.out.println("제품번호: "+product.num);
	}

	private static Product makeProduct(String productName) {
		Product product = new Product();
		product.name = productName;
		product.num = (int)(Math.random()*1000)+1;
		product.price = ((int)(Math.random()*100)+1)*10000;
		return product;
	}
}
class Product{
	String name;
	int price;
	int num;
}
