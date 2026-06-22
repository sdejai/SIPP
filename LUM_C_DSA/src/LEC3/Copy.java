package LEC3;

public class Copy extends Bag{
	public void disly() {
		System.out.println("Copy");
	}
	
	public static void main(String[] args) {
		Copy obj = new Copy();
		obj.name();
		obj.disly();
	}
}
