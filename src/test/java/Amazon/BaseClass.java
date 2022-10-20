package Amazon;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
    static WebDriver driver;
	public static void launch() throws InterruptedException  {
    WebDriverManager.chromedriver().setup();
	// System.setProperty("webdriver.chrome.driver","C:\\Users\\prade\\eclipse-workspace\\Facebook\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
    }
	public static void pUrl() {
	String URL = driver.getCurrentUrl();
	System.out.println("The URL is :" +URL);
	}
	
	public static void printTitle() {
		String TITLE = driver.getTitle();
		System.out.println("The Title is :" +TITLE);
	
	}
	/*public static void useremail() {
		WebElement uId = driver.findElement(By.xpath("//input[@id='ap_email']"));
	   // uId.sendKeys("daprad@gmail.com");
	    JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('daprad@gmail.com')",uId);
	}
	
	public static void screenCapture() throws IOException {
		TakesScreenshot tk = (TakesScreenshot)driver;
	   	File Source = tk.getScreenshotAs(OutputType.FILE);
	   	File Destination = new File("C:\\Users\\prade\\Desktop\\manual testing\\Task12 outputs\\output1.png");
	   	FileUtils.copyFile(Source, Destination);
	  }*/
		
	}


