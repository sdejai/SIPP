package LEC3;

public class Fan {
	private String brandName;
	private  String colour;
	private int price;
	private int capcity;
	
	public Fan() {
		
	}
	public Fan(String brandName, String colour, int price, int capcity) {
		this.brandName = brandName;
		this.colour = colour;
		this.price = price;
		this.capcity = capcity;
	}
	public void setBrandName(String brandName) {
		this.brandName=brandName;
	}
	public String getBrandName() {
		return this.brandName;
	}
	
	public void prntDetails() {
		System.out.println(brandName+" "+colour+" "+price+" "+capcity);
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCapcity() {
		return capcity;
	}
	public void setCapcity(int capcity) {
		this.capcity = capcity;
	}
	public void  speedInc(){
		System.out.println("Speed increas");
	}
	public void  speedCre(){
		System.out.println("Speed increas");
	}
	
}
