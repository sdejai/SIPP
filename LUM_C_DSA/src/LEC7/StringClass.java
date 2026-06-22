package LEC7;

public class StringClass {
	public static void main(String[] args) {
//		String city="Mathura";
//		String city1="Mathura";
//		System.out.println(city==city1);
//		String city2=new String("Mathura");
//		String city3=new String("Mathura");
//		System.out.println(city2==city3);
//		System.out.println(city2.equals(city3));
//		System.out.println(city==city2);
//		String city4= new String("Mathura").intern();
//		System.out.println(city4==city);
//		
//		String name="Aman";
//		name+="kumar";
//		System.out.println(name);
		String words="Hey class you are near to palce";
		String arrWords[]=words.split(" ");
		for(String value:arrWords) {
			for(int i=value.length()-1;i>=0;i--) {
				System.out.print(value.charAt(i));
			}
			System.out.println();
		}
	}
}
