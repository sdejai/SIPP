package LEC5;

public class ExceptionHandling {
	public static int fact(int n) {
		return n*fact(n-1);
	}
	public static void main(String[] args) {
		fact(5);
//		System.out.println("Hello");
//		System.out.println("Hey");
//		System.out.println(2/0);
//		System.out.println("LUM Students");
	}
}
