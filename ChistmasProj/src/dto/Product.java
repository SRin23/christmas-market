package dto;

import java.io.Serializable;

public class Product implements Serializable{
	private static final long serialVersionID = -4274700572038677000L;
	
	private String productId;	//占쏙옙품 占쏙옙占싱듸옙
	private String pname;	//占쏙옙품占쏙옙
	private Integer price;	//占쏙옙품占쏙옙占쏙옙
	private Integer length;
	private Integer older;
	private String material;
	private String description;	//占쏙옙품占쏙옙占쏙옙
	private String seller;	//占쏙옙占쏙옙占쏙옙
	private String category;	//占싻뤄옙
	private String condition;	//占신삼옙품 or 占쌩곤옙품 or 占쏙옙占실�
	private String fileName;	//�씠誘몄� �뙆�씪
	private int quantity; //�옣諛붽뎄�땲�뿉 �떞�� �긽�뭹�쓽 媛쒖닔
	
	public Product() {
		super();
	}
	
	public Product(String productId, String pname, Integer price) {
		this.productId = productId;
		this.pname = pname;
		this.price = price;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSeller() {
		return seller;
	}
	
	public void setSeller(String seller) {
		this.seller = seller;
	}
	
	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public Integer getOlder() {
		return older;
	}

	public void setOlder(Integer older) {
		this.older = older;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public static long getSerialversionuid() {
		return serialVersionID;
	}

}
