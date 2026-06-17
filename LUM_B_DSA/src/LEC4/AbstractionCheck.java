package LEC4;

public  class AbstractionCheck extends AbstractionClass{

	AbstractionCheck(){
		
	}
	AbstractionCheck(String name,int price){
		super(name, price);
	}
	@Override
	public int sum(int num1, int num2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void hot() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void BoostMood() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		AbstractionCheck obj = new AbstractionCheck("Thoshiba",12411);
		obj.Off();
		System.out.println((obj.name));
	}

}
