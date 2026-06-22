package LEC4;

public class RuntimePolyMorphism extends Laptop{
	public void display() {
		System.out.println("RunTime PloyMorphism");
	}
	public static void main(String[] args) {
		RuntimePolyMorphism obj  = new RuntimePolyMorphism();
		obj.display();
	}
}
