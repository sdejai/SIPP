package LEC3;

public class FanUser {
	public static void main(String[] args) {
		Fan obj = new Fan("Hevels","white",1200,4500);
		obj.prntDetails();
////		obj.brandName="Hevels";
		obj.setBrandName("Oriantes");
		obj.setPrice(2000);
		obj.prntDetails();
//		System.out.println(obj.getBrandName());
////		Fan obj1 = new Fan("Oriante","white",1200,4500);
	}
}
