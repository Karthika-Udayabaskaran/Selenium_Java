package Week2;

public class InheritanceCar  extends Vehic{

	public void gear()
	{
		System.out.println("Gear Applied");
	}
	
	public static void main(String[] args) {
		
		InheritanceCar c= new InheritanceCar();
		c.applybreak();
		c.applySound();
		c.gear();
		

		
		
	}

}


