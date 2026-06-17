package LEC4;

public class Projector implements InterfaceProjector{

	@Override
	public void movieCasting() {
		System.out.println("Movie Sony");
	}

	@Override
	public void zoom() {
		System.out.println("Zoom Sony");
	}

	@Override
	public void displyQulity() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		InterfaceProjector.name();
	}

}
