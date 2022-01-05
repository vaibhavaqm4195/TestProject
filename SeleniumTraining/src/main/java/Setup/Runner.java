package Setup;

import Pages.LoginPage;



public class Runner {

	public static void main(String[] args) {
//		BrowserLaunch b =new BrowserLaunch();
//		b.browsersetup();
		
		LoginPage lp =new LoginPage();
		lp.browsersetup();
		lp.filllogindetails();
	}
}
