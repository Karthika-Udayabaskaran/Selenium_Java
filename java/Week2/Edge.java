package Week2;

public class Edge extends Browser {

	public void  takeSnap() {
		System.out.println("Take Snap");

	}
	
	
	public void clearCookies() {
		System.out.println("clearcookies");
	}
	
	
	public static void main(String[] args) {
		Edge e = new Edge ();
		
	e.takeSnap();
	e.clearCookies();

	e.openURL();
	e.closeBrowser();
	e.navigationBrowser();
	String bn =e.browserName;
	String bv =e.browserVersion;
	System.out.println("BrowserName :" +bn);
	System.out.println("BrowserVersion :" +bv);	
	}

}
