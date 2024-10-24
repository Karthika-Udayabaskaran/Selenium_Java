package Week2;

public  abstract class Hdfcbank implements RBI{


	public  void KnowYourCustomer() {

		System.out.println("KYC-HDFC");
	}

	public void RD() {
		System.out.println("RD-HDFC");
	}


	public abstract void openaccount();
	
}
