package Week2;

public class Amazon extends CanaraBank{

	public static void main(String[] args) {
		
		Amazon a = new Amazon();
		a.cashOnDeliver();
		a.upiPayments();
		a.cardPayments();
		a.internetBanking();
		a.recordPaymentDetails();
	}

	@Override
	public void cashOnDeliver() {
		System.out.println("cashOnDeliver -Payments");
	}

	@Override
	public void upiPayments() {
		System.out.println("upiPayments -Payments");	
	}

	@Override
	public void cardPayments() {
		System.out.println("cardPayments -Payments");
	}

	@Override
	public void internetBanking() {
		System.out.println("internetBanking-Payments");
	}

	@Override
	public void recordPaymentDetails() {
		
		System.out.println("RecordPayemts Details ");
	}


	

}
