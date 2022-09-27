package OnlineShop.OnlineShoppingMall.Categeries;

public class Product {

	private int productId;
	static String color;
	private String price;

	public static String colour(String a) {
		color = a;
		return color;

	}

	Product() {
		super();
		// System.out.println("Hii i am super most class");
	}

	Product(int productId) {
		this();
		this.productId = productId;
	}

	Product(int productId, String price) {
		this(productId);
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

}
