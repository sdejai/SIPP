package LEC4;

public class WashingMachine implements WashingMachineInterface{

	@Override
	public void QuickWash() {
		System.out.println("QuickWash");
	}

	@Override
	public void dry() {
		System.out.println("dry");
		
	}

	@Override
	public void timer() {
		System.out.println("timer");
	}
	public static void main(String[] args) {
		WashingMachine obj = new WashingMachine();
		obj.dry();
		obj.timer();
	}

}
