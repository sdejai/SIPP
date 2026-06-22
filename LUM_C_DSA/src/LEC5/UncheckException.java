package LEC5;

public class UncheckException {
	public static void withDraw(int amount,int withDrwaAmount) throws Exception {
		if(amount<withDrwaAmount) {
			throw new Exception("Paise nhi h");
		}else {
			System.out.println("WithDraw!!!");
		}
	}
	public static int div(int n1,int n2) throws ArithmeticException {
		return n1/n2;
	}
	public static void main(String[] args) {
		try {
			withDraw(12000,2000);
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			System.out.println(div(2,0));
		}catch (ArithmeticException e) {
			System.out.println(e);
		}
	
		System.out.println("Hey");
	}
}
