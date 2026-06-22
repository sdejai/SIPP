package LEC5;

public class FinnayBlock {
	public static int sum(int num1,int num2) {
		try {
			return num1+num2;
		}finally {
			System.out.println("Hey");
		}
	}
	public static void main(String[] args) {
		System.out.println(sum(12,4));
	}

}
