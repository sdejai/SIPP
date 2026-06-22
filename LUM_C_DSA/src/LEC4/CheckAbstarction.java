package LEC4;

public class CheckAbstarction extends AbstractClass{

	
	public static void main(String[] args) {
		CheckAbstarction obj = new CheckAbstarction();
		obj.sum(12, 2);
	}

	@Override
	public void sum(int n1, int n2) {
		System.out.println(n1+n2);
	}

}
