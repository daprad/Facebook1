package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AmazonExecution extends BaseClass {
	static POM a;
	public static WebDriver driver;

	@Test
	public static void TC1() throws InterruptedException {
		launch();
	}

	@Test
	public static void TC2(){
		pUrl();
	}
/*
	@Test
	public static void TC3() {
	    printTitle();
	}

	@Test
	public static void TC4(){
	a = new POM();
	WebElement signIn = a.getSignin();
	signIn.click();
	//signIn();
	//JavascriptExecutor js = (JavascriptExecutor)driver;
	 
	//js.executeScript("arguments[0].setAttribute('daprad@gmail.com')", userName);
        // useremail();

}*/
}


