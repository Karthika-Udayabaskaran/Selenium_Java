package Week2;

public class Axis implements RBI {

	public static void main(String[] args) {
		
		Axis a = new Axis();
		a.RD();
		a.KnowYourCustomer();
		a.Withdrawallimit();
		
	}

	@Override
	public void KnowYourCustomer() {
		System.out.println("KYC");
	}

	@Override
	public void Withdrawallimit() {
		System.out.println("40000");
	}

	public void RD() {
		System.out.println("Open RD");
	}

}
