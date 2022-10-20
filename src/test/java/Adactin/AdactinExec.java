package Adactin;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AdactinExec extends AdactinBaseClass {
	static PomLocator p ;
	@Test(invocationCount = 10)
	public static void launch() throws InterruptedException {
		browserLaunch();
	}

	/*@Test
	public static void maxi() {
		maximize();
	}

	@Test
	public static void urlTitle() throws InterruptedException {
		returnUrl();
		returnTitle();

	}
	@Test
	public static void signIn() throws InterruptedException, IOException {
		getIN();
		roomSelection();
	    booking();
	    sShot();
	    }*/
	
}
