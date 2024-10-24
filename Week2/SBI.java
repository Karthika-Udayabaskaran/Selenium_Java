package Week2;

public class SBI extends Axis implements RBI{

	public void Addchange() {
		
		System.out.println("Adresschange");
	}

	@Override
	public void KnowYourCustomer() {
		
		System.out.println("KYC");
	}

	@Override
	public void Withdrawallimit() {
		
		System.out.println("10000");
	}
		public static void main(String[] args) {

		SBI obj= new SBI();
		obj.Addchange();
		obj.KnowYourCustomer();
		obj.Withdrawallimit();
		//obj.RD();



	}

}
