package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TryNow {
WebDriver driver;
	
	//constructor
   public TryNow(WebDriver driver)
	 {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//Locator
   
	@FindBy(xpath="(//button[@class='px-8 py-4 bg-gradient-to-r from-indigo-600 to-purple-600 text-white rounded-xl shadow-xl hover:shadow-2xl transition-all transform hover:-translate-y-1 font-medium'])[1]")
	WebElement trynow;
	
	
	
	@FindBy(xpath="(//input[@id='email'])[1]")
	WebElement email;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="(//button[normalize-space()='Sign In'])[1]")
	WebElement signbtn;
	
	
	@FindBy(xpath="(//input[@placeholder='Type your question here...'])[1]")
	WebElement search;
	
	@FindBy(xpath="(//*[name()='svg'][@class='lucide lucide-send h-5 w-5'])[1]")
	WebElement searchbtn;
	
	@FindBy(xpath="(//button[normalize-space()='Map View'])[1]")
	WebElement mapview;
	
	@FindBy(xpath="(//button[normalize-space()='Voice View'])[1]")
	WebElement voiceview;
	
	
	
	
	
	
	public void tryNow() {
		trynow.click();
	}
	
	public void Email(String mail) {
		email.sendKeys(mail);
	}
	
	public void Passoword(String pass) {
		password.sendKeys(pass);
	}
	
	public void signBtn() {
		signbtn.click();
	}
	
	public void Search(String se) {
		search.sendKeys(se);
	}
	
	public void searchBtn() {
		searchbtn.click();
	}
	
	public void mapView() {
		mapview.click();
	}
	
	public void voiceView() {
		voiceview.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
