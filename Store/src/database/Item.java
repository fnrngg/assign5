package database;

public class Item {
	private String productId;
	private String name;
	private String imageFile;
	private double price;
	
	public Item(String productId, String name, String imageFile, double d) {
		this.productId = productId;
		this.name = name;
		this.imageFile = imageFile;
		this.price = d;
		
	}

	public String getName() {
		return name;
	}
	
	public String getImage() {
		return imageFile;
	}
	
	public Double getPrice() {
		return price;
	}

}
