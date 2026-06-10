package LEC2;

public class Encapsulation {
	public static void main(String[] args) {
		Fan obj = new Fan();
		obj.setbrandName("Oriate");
//		obj.brandName="Oriante";
//		obj.col;
		System.out.println(obj.getbrandName());
		obj.setCol("white");
		System.out.println(obj.getCol());
	}
}
