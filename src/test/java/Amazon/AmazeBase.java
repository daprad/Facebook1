package Amazon;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazeBase {
	static AmazePOM p;
	static WebDriver driver;
	static Actions act;
	public static void bLaunch() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		p = new AmazePOM();
		//act = new Actions(driver);
		//act.moveToElement(p.getSigning());
		
	    p.getSigning().click();
		}
/*public static void sighIn() throws InterruptedException {
		
		act = new Actions(driver);
		act.moveToElement(p.getSigning());
		Thread.sleep(2000);
	    p.getSigning().click();
	    
	}   */
	public static void printURL() {
        String URL = driver.getCurrentUrl();
        System.out.println(URL);
	}
    public static void title() {
    	String Title = driver.getTitle();
    	System.out.println(Title);
    }
    public static void credentialsOne() {
    	p.getUserid().sendKeys("daprad1234@gmail.com");
    	p.getContin().click();
    	
    }
    public static void credentialsTwo() {
    	p.getPass().sendKeys("Amazon@123");
    	p.getSubmit().click();
    }
    
   
    public static void searchProduct() {
    	p.getSearch().sendKeys("iphone 14");
    	p.getSrchbtn().click();
    }
    public static void prod() {
    	p.getPhonereq().click();
    	
    }
    public static void wh() {
    	Set<String> WinHan = driver.getWindowHandles();
    	List<String> newwindow = new ArrayList<String>(WinHan);
    	driver.switchTo().window(newwindow.get(1));
    	p.getCart().click();
    
    	
    }
    
  
}


