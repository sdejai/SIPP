package LEC3;

public class PloyMorphism {
	

	public static void sum(int n1,int n2) {
		System.out.println(n1+n2);
	}
	public static void sum(float n1,float n2) {
		System.out.println(n1+n2);
	}
	public static float sum (float n1,float n2,float n3) {
		return n1+n2+n3;
	}
	
	public static void main(String[] args) {
		sum(12,3);
		sum(1.3f,2.0f);
		System.out.println(sum(1.3f,2.0f,12.3f));
	}
}
