package week1.day1;

public class Browser {

	public static void main(String[] args) {
		Browser b= new Browser();
		System.out.println(b.launchBrowser("Chrome"));
		b.loadUrl();
		
	}
	
	 String launchBrowser(String browserName){
		
		System.out.println("Browser launched successfully");
		return browserName;
		
	}
	
	void loadUrl()
	{
		System.out.println("Application url loaded successfully");
	}

}
