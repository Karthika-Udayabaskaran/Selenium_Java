package Week2;

public class LoginTestData extends TestData {

	
	public void  enterUsername(String username) {
		System.out.println("Enter the Username: " +username);
	}
	public void enterPassword(String password) {
		System.out.println("Enter the password: " +password);
	}
	public static void main(String[] args) {
		
		LoginTestData l = new LoginTestData();
		l.enterCredentials("Credential Entered");
		l.enterUsername("TestLeaf");
		l.enterPassword("12345");
	}

}
