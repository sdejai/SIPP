package LEC5;

public class ExceptionHandling {
	public static int fact(int n) {
		if(n==1 || n==0) {
			return 1;
		}
			return n*fact(n-1);
		
	}
	public static void main(String[] args) {
		System.out.println(fact(5));
		System.out.println("Hey");
//		System.out.println( "Hello class");
//		System.out.println( "Hello class LUM C Section");
//		try {
//			System.out.println(2/0);
//		}catch (Exception e) {
//			System.out.println(e);
//		}
//		
//		System.out.println( "Hello Amit ");
	}
}
