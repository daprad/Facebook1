package Adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomLocator extends AdactinBaseClass{
	
	public PomLocator() {
		PageFactory.initElements(driver,this);


	}
	@FindBy(xpath="//*[@id='username']")
	private WebElement user;
	@FindBy(xpath="//*[@id='password']")
	private WebElement pass;
	@FindBy(xpath="//*[@id='login']")
	private WebElement log;
	@FindBy(xpath="//*[@id='location']")
	private WebElement loc;
	@FindBy(xpath="//*[@id='hotels']")
	private WebElement hotels;
	@FindBy(xpath="//*[@id='room_type']")
	private WebElement roomtype;
	@FindBy(xpath="//*[@id='room_nos']")
	private WebElement roomnos;
	@FindBy(xpath="//*[@id='adult_room']")
	private WebElement adults;
	@FindBy(xpath="//*[@id='child_room']")
	private WebElement children;
	@FindBy(xpath="//*[@id='Submit']")
	private WebElement submit;
	@FindBy(xpath="//*[@id='datepick_in']")
	private WebElement checkin;
	@FindBy(xpath="//*[@id='datepick_out']")
	private WebElement checkout;
	@FindBy(xpath="//*[@id='radiobutton_0']")
	private WebElement roomOk;
	@FindBy(xpath="//*[@id='continue']")
	private WebElement contin;
	@FindBy(xpath="//*[@id='first_name']")
	private WebElement firstname;
	@FindBy(xpath="//*[@id='last_name']")
	private WebElement lastname;
	@FindBy(xpath="//*[@id='address']")
	private WebElement addr;
	@FindBy(xpath="//*[@id='cc_num']")
	private WebElement creditcard;
	@FindBy(xpath="//*[@id='cc_type']")
	private WebElement cctype;
	@FindBy(xpath="//*[@id='cc_exp_month']")
	private WebElement ccexp;
	@FindBy(xpath="//*[@id='cc_exp_year']")
	private WebElement expyr;
	@FindBy(xpath="//*[@id='cc_cvv']")
	private WebElement cvv;
	@FindBy(xpath="//*[@id='book_now']")
	private WebElement book;
	@FindBy(xpath="//input[@id='my_itinerary']")
	private WebElement scroll;
	public WebElement getScroll() {
		return scroll;
	}
	public void setScroll(WebElement scroll) {
		this.scroll = scroll;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public void setFirstname(WebElement firstname) {
		this.firstname = firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public void setLastname(WebElement lastname) {
		this.lastname = lastname;
	}
	public WebElement getAddr() {
		return addr;
	}
	public void setAddr(WebElement addr) {
		this.addr = addr;
	}
	public WebElement getCreditcard() {
		return creditcard;
	}
	public void setCreditcard(WebElement creditcard) {
		this.creditcard = creditcard;
	}
	public WebElement getCctype() {
		return cctype;
	}
	public void setCctype(WebElement cctype) {
		this.cctype = cctype;
	}
	public WebElement getCcexp() {
		return ccexp;
	}
	public void setCcexp(WebElement ccexp) {
		this.ccexp = ccexp;
	}
	public WebElement getExpyr() {
		return expyr;
	}
	public void setExpyr(WebElement expyr) {
		this.expyr = expyr;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public void setCvv(WebElement cvv) {
		this.cvv = cvv;
	}
	public WebElement getBook() {
		return book;
	}
	public void setBook(WebElement book) {
		this.book = book;
	}
	public WebElement getContin() {
		return contin;
	}
	public void setContin(WebElement contin) {
		this.contin = contin;
	}
	public WebElement getRoomOk() {
		return roomOk;
	}
	public void setRoomOk(WebElement roomOk) {
		this.roomOk = roomOk;
	}
	public WebElement getCheckin() {
		return checkin;
	}
	public void setCheckin(WebElement checkin) {
		this.checkin = checkin;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	public void setCheckout(WebElement checkout) {
		this.checkout = checkout;
	}
	public WebElement getUser() {
		return user;
	}
	public void setUser(WebElement user) {
		this.user = user;
	}
	public WebElement getPass() {
		return pass;
	}
	public void setPass(WebElement pass) {
		this.pass = pass;
	}
	public WebElement getLog() {
		return log;
	}
	public void setLog(WebElement log) {
		this.log = log;
	}
	public WebElement getLoc() {
		return loc;
	}
	public void setLoc(WebElement loc) {
		this.loc = loc;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public void setHotels(WebElement hotels) {
		this.hotels = hotels;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(WebElement roomtype) {
		this.roomtype = roomtype;
	}
	public WebElement getRoomnos() {
		return roomnos;
	}
	public void setRoomnos(WebElement roomnos) {
		this.roomnos = roomnos;
	}
	public WebElement getAdults() {
		return adults;
	}
	public void setAdults(WebElement adults) {
		this.adults = adults;
	}
	public WebElement getChildren() {
		return children;
	}
	public void setChildren(WebElement children) {
		this.children = children;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}
}
