package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\prade\\eclipse-workspace\\Facebook\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	WebElement signIn = driver.findElement(By.xpath("//*[text()='Hello, sign in']"));
	signIn.click();
	
}
}