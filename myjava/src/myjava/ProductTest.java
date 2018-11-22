package myjava;

public class ProductTest {

	public static void main(String[] args) {
		String productName = "�����е�";
		Product product = makeProduct(productName);
		
		System.out.println("��ǰ��: "+product.name);
		System.out.println("����: "+product.price+"��");
		System.out.println("��ǰ��ȣ: "+product.num);
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
