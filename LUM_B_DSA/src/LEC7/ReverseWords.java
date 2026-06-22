package LEC7;

public class ReverseWords {
	public static void main(String[] args) {
		
		String str="Hey Class LUM Setion b";
		String[] value=str.split(" ");//value 0--hey 1--calss 2--LUM
//		value[0];
		for(int i=0;i<value.length;i++) {
			String name=value[i];
			for(int j=name.length()-1;j>=0;j--) {
				System.out.println(name.charAt(j));
			}
			System.out.println();
		}
		
		
	}
}
