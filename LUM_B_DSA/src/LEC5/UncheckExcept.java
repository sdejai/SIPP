package LEC5;

public class UncheckExcept {
	public static void withdraw(int withdrawAmount,int amount)  throws Exception{
			if(withdrawAmount>amount) {
				throw new Exception("Insf blance");
			}
			else {
				System.out.println("Withdraing!!!");
			}
			
	
		
	}
	public static void main(String[] args) {
		
		try {
			withdraw(1200,10000);
		}catch (Exception e) {
			System.out.println(e);
		}
		
		
//		int arr[]= {1,2,37,4};
//		System.out.println("Array");
//		try {
//			System.out.println(arr[4]);
//		}catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(e);
//		}
//		System.out.println("Array 2");
	}
}
