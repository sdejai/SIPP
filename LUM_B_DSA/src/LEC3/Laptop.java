package LEC3;

public class Laptop {
	private String brandName;
	private String processor;
	private int price;
	
	public Laptop() {
		
	}
	
	public Laptop(String brandName, String processor, int price) {
		this.brandName = brandName;
		this.processor = processor;
		this.price = price;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void coding() {
		System.out.println(brandName+"laptop can code!!!");
	}
}
