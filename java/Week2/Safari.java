package Week2;

public class Safari extends Browser {

	public void readerMode() {
	System.out.println("Readmdode");


	}

	
	public void fullScreenMode() {
	System.out.println("Fullscreen mode");	
	}
	
	public static void main(String[] args) {
		
		Safari s= new Safari();
		s.openURL();
		s.closeBrowser();
		s.navigationBrowser();
	
		s.readerMode();
		s.fullScreenMode();
		

		String bn =s.browserName;
		String bv =s.browserVersion;
		System.out.println("BrowserName :" +bn);
		System.out.println("BrowserVersion :" +bv);	
		}

}
