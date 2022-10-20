package Amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM extends BaseClass {
	public POM() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "//*[text()='Hello, sign in']")
	private WebElement signin;
	@FindBy(xpath = "//input[@id='ap_email']")
	private WebElement userid;
	@FindBy(xpath = "//input[@id='ap_password']")
	private WebElement password;
	@FindBy(xpath = "//input[@id='signInSubmit']")
	private WebElement loginbtn;
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement search;
	@FindBy(xpath = "Apple iPhone 13 Pro (128GB) - Sierra Blue")
	private WebElement item;
    public WebElement getSignin() {
		return signin;
	}
    public WebElement getUserid() {
		return userid;
	}
    public WebElement getPassword() {
		return password;
	}
    public WebElement getLoginbtn() {
		return loginbtn;
	}
    public WebElement getSearch() {
		return search;
	}
    public WebElement getItem() {
		return item;
	}

}