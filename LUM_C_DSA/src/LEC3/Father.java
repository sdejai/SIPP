package LEC3;

public class Father extends GrandFather{
	public Father() {
		System.out.println("Father constor");
	}
	public static void main(String[] args) {
		Father obj= new Father();
		obj.disp();
	}
}
