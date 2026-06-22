package LEC3;

public class Polymorphism {

	public static void sum(int  n1, int n2 ) {
		System.out.println(n1+n2);
	}
	public static float sum(float n1, float n2 ) {
		return n1+n2;
	}
	public static void sum(int n1,int n2,int n3) {
		System.out.println(n1+n2+n3);
	}
	public static void main(String[] args) {
		sum(12,3);
		sum(12.3f,1.3f);
		sum(12,3,4);
	}

}
