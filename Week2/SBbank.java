package Week2;

public class SBbank extends Hdfcbank implements RBI {

	@Override
	public void Withdrawallimit() {
		
	}

	@Override
	public void openaccount() {
		System.out.println("This was a abstract Method");
	}

	
	
	public static void main(String[] args) {
		SBbank sb=  new SBbank();
		sb.Withdrawallimit();
		sb.openaccount();
		sb.RD();
		
	}

	
}
