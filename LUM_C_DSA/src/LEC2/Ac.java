package LEC2;

public class Ac {
	//state //instance varible //field 
	String brandName;
	String colour;
	float capcity;
	int price;
	float dm;
	
//	constructor
	public Ac(){
		
	}
	public Ac(String brandName,String colour,float capcity,int price,float dm){
		this.brandName=brandName;
		this.colour=colour;
		this.capcity=capcity;
		this.price=price;
		this.dm=dm;
	}
	
	public void printDetails() {
		System.out.println(brandName+" "+colour+" "+capcity+" "+price+" "+dm);
	}
	//behavious //Methods
	public void coldAir() {
		System.out.println("cold air!!");
	}
	public void hotAir() {
		System.out.println("cold air!!");
	}
	public void swing() {
		System.out.println("cold air!!");
	}
	public static void main(String[] args) {
		Ac  obj  = new Ac("Toshiba","white",5400.5f,65000,1200);
		obj.printDetails();
		Ac  obj2  = new Ac("LG","white",5400.5f,43560,1200);
		obj2.printDetails();
		Ac  obj3  = new Ac();
	}
	
}
