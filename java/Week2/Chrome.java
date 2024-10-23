package Week2;

public class Chrome extends Browser {

	public void openIncognito()
	{
		System.out.println("Opend in Incognito");


	}


	public void clearCache()
	{
		System.out.println("Cache Cleared");
	}
	public static void main(String[] args) {
		Chrome c = new Chrome();
		c.openIncognito();
		c.clearCache();
		c.openURL();
		c.closeBrowser();
		c.navigationBrowser();
		String bn =c.browserName;
		String bv =c.browserVersion;
		System.out.println("BrowserName :" +bn);
		System.out.println("BrowserVersion :" +bv);	

	}

}
