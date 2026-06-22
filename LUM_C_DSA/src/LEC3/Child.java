package LEC3;

public class Child extends Father{
	public Child() { 
		System.out.println("Child constorr");
	}
	public static void main(String[] args) {
		Child obj = new Child();
		obj.disp();
	}
}
