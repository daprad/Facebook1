package Amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazePOM extends AmazeBase{
	public AmazePOM() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//*[text()='Hello, sign in']")
	private WebElement signing;
	@FindBy(xpath = "//input[@id='ap_email']")
	private WebElement userid;
	@FindBy(id="continue")
	public WebElement contin;
	@FindBy(id="ap_password")
	private WebElement pass;
	@FindBy(id="signInSubmit")
	private WebElement submit;
	@FindBy(id="twotabsearchtextbox")
	private WebElement search;
	@FindBy(id="nav-search-submit-button")
	private WebElement srchbtn;
	@FindBy(xpath="//span[contains(text(),'Apple iPhone 14 512GB Midnight')]")
	private WebElement phonereq;
	@FindBy(id="add-to-cart-button")
	private WebElement cart;
	@FindBy(xpath="//*[text()='Proceed to checkout (1 item)']")
	private WebElement chkout;
	
	public WebElement getChkout() {
		return chkout;
	}
	public void setChkout(WebElement chkout) {
		this.chkout = chkout;
	}
	public WebElement getCart() {
		return cart;
	}
	public void setCart(WebElement cart) {
		this.cart = cart;
	}
	public WebElement getPhonereq() {
		return phonereq;
	}
	public void setPhonereq(WebElement phonereq) {
		this.phonereq = phonereq;
	}
	public WebElement getSrchbtn() {
		return srchbtn;
	}
	public void setSrchbtn(WebElement srchbtn) {
		this.srchbtn = srchbtn;
	}
	public WebElement getSearch() {
		return search;
	}
	public void setSearch(WebElement search) {
		this.search = search;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}
	public WebElement getPass() {
		return pass;
	}
	public void setPass(WebElement pass) {
		this.pass = pass;
	}
	public WebElement getContin() {
		return contin;
	}
	public void setContin(WebElement contin) {
		this.contin = contin;
	}
	public WebElement getSigning() {
		return signing;
	}
	public void setSigning(WebElement signing) {
		this.signing = signing;
	}
	public WebElement getUserid() {
		return userid;
	}
	public void setUserid(WebElement userid) {
		this.userid = userid;
	}
	

}
