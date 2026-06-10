package LEC2;


public class Fan {
	// state/properties // instance variable //field var
	private String brandName;
	private float dem;
	private String col;
	
	//behavios//method
	
	
	 public Fan(){
		
	}
	public Fan(String brandName, float dem, String col){
		this.brandName=brandName;
		this.dem=dem;
		this.col=col;
	}
	
	public void setCol(String col) {
		this.col=col;
	}
	public String getCol() {
		return this.col;
	}
	public void setbrandName(String brandName) {
		this.brandName=brandName;
	}
	public String getbrandName() {
		return this.brandName;
	}
	public void airFlow(){
		System.out.println("Air flowing ");
	}
	
	public void speedInc(){
		System.out.println("Boost mood ");
	}
	public void printDetails() {
		System.out.println(brandName+" "+ dem+" "+col);
	}
	public static void main(String[] args) {
		Fan obj1= new Fan("Hevels",1244.3f,"White");
		Fan obj2=new Fan("Bjaj",1443.3f,"White");
		obj2.printDetails();
	}
	
	
}




