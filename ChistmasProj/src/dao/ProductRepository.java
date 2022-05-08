package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductRepository {
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	private static ProductRepository instance = new ProductRepository();
	public static ProductRepository getInstance() {
		return instance;
	}

	
	public ProductRepository() {
		Product HarryPotterCane = new Product("P1234", "�ظ����� ������", 1600000);
		HarryPotterCane.setDescription("�ظ����Ͱ� ����� ���� ������ �Դϴ�.");
		HarryPotterCane.setSeller("ȣ�׿�Ʈ");
		HarryPotterCane.setLength(20);
		HarryPotterCane.setOlder(160);
		HarryPotterCane.setMaterial("�ҳ���");
		HarryPotterCane.setCategory("Magin Cane");
		HarryPotterCane.setCondition("New");
		HarryPotterCane.setFileName("P1234.png");
		
		
		listOfProducts.add(HarryPotterCane);
		
	}
	
	public ArrayList<Product> getAllProducts(){
		return listOfProducts;
	}
	
	public Product getProductById(String productId) {
		Product productById = null;
		
		for(int i = 0; i<listOfProducts.size(); i++) {
			Product product = listOfProducts.get(i);
			if(product != null && product.getProductId() != null && product.getProductId().equals(productId)) {
				productById = product;
				break;
			}
		}
		
		return productById;
	}
	
	public void addProduct(Product product) {
		listOfProducts.add(product);
	}
}
