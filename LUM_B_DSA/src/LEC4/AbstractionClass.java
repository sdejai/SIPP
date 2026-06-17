package LEC4;

public abstract class AbstractionClass {
	String name;
	int price;
	public AbstractionClass(){
		
	}
	 public AbstractionClass(String name,int price){
			this.name=name;
			this.price=price;
		}
	public void cooling() {
		System.out.println("Cool");
	}
	public void Off() {
		System.out.println("OFF");
	}
	public abstract int sum(int num1,int num2);
	public abstract void hot();
	public abstract void BoostMood();
	
	
	public static void main(String[] args) {
//		AbstractionClass obj = new AbstractionClass();
//		obj.BoostMood();
//		obj.sum(12,43);
	}
}
