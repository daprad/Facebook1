package Adactin;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinBaseClass {
	static WebDriver driver;
	static PomLocator p ;
	static  Select s;;
public static void browserLaunch() throws InterruptedException {
	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
    driver.get("https://www.youtube.com/watch?v=YnzqMyxZen8&t=1s");
	Actions aa = new Actions(driver);
	aa.sendKeys(Keys.SPACE).build().perform();
	Thread.sleep(120000);
	driver.quit();
    /*driver.switchTo().newWindow(WindowType.TAB);

	driver.navigate().to("http://adactinhotelapp.com/index.php");
	//driver.navigate().refresh();
	//driver.navigate().back();
	//Thread.sleep(3000);
	//driver.navigate().forward();
	//Thread.sleep(2000);
	//driver.quit();
	}
public static void maximize() {
	driver.manage().window().maximize();
}
public static void returnUrl() {
	String URL = driver.getCurrentUrl();
	System.out.println("The URL is   :" +URL);
}
public static void returnTitle() throws InterruptedException {
	String TITLE = driver.getTitle();
	System.out.println("The Title is  :" +TITLE);	
	//Thread.sleep(3000);
	
	}
public static void getIN() {
	p = new PomLocator();
	//JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("arguments[0].setAttribute('daprad123')",p.getUser());
	//js.executeScript("arguments[0].setAttribute('password')",p.getPass());
	//js.executeScript("arguments[0].click()",p.getLog());
	//WebElement user = driver.findElement(By.xpath("//*[@id='username']"));
//	user.sendKeys("username");
	p.getUser().sendKeys("daprad123");
	p.getPass().sendKeys("password");
	p.getLog().click();
	
}
public static void roomSelection() {
	s = new Select(p.getLoc());
	s.selectByIndex(2);
	s = new Select(p.getHotels());
    s.selectByIndex(2);
    s = new Select(p.getRoomtype());
	s.selectByIndex(2);
	s = new Select(p.getRoomnos());
	s.selectByIndex(2);
	s = new Select(p.getAdults());
	s.selectByIndex(2);
	s = new Select(p.getChildren());
	s.selectByIndex(2);
	p.getSubmit().click();
	p.getRoomOk().click();
	p.getContin().click();
}
public static void booking() {
	p.getFirstname().sendKeys("Pradeep");
	p.getLastname().sendKeys("kumar");
	p.getAddr().sendKeys("1,first street");
	p.getCreditcard().sendKeys("1234567890098765");
	s = new Select(p.getCcexp());
	s.selectByIndex(2);
	s=new Select(p.getExpyr());
	s.selectByIndex(2);
	s= new Select(p.getCctype());
	s.selectByIndex(2);
	p.getCvv().sendKeys("525");
	p.getBook().click();
	Actions acc = new Actions(driver);
    WebElement we = driver.findElement(By.id("search_hotel"));
	acc.scrollToElement(we);
}
public static void sShot() throws IOException {
	TakesScreenshot tk = (TakesScreenshot)driver;
	File source = tk.getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\Users\\prade\\Desktop\\manual testing\\Task12 outputs\\myoutput.png");
	FileUtils.copyFile(source,destination);
	
}*/
}
}


	


