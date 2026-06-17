package LEC5;

public class FinllyBlock {
	public static int div(int num1,int num2) {
		try {
			return num1/num2;
		}finally {
			System.out.println("Hello");
		}
		
	}
	public static void main(String[] args) {
		System.out.println(div(2,1));
	}
}
