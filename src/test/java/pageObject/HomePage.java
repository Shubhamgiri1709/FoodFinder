package pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
WebDriver driver;
	
	//constructor
   public HomePage(WebDriver driver)
	 {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Features")
	WebElement features;
	
	@FindBy(xpath="(//a[normalize-space()='How It Works'])[1]")
	WebElement howItWorks;
	
	@FindBy(xpath="(//a[normalize-space()='Testimonials'])[1]")
	WebElement testimonials;
	
	@FindBy(xpath="(//*[name()='path'][@stroke-linecap='round'])[1]")
	WebElement mode;
	
	@FindBy(xpath="(//a[normalize-space()='Get Started'])[1]")
	WebElement getstarted;
	
	@FindBy(xpath="(//div[@class='w-10 h-10 bg-gradient-to-br from-indigo-500 to-purple-600 rounded-lg flex items-center justify-center shadow-lg'])[1]")
	WebElement backbtn;
	
	@FindBy(xpath="(//a[@class=\"hover:text-indigo-400 hover:translate-x-1 inline-block transform transition-all duration-300 relative after:content-[''] after:absolute after:bottom-0 after:left-0 after:w-0 after:h-0.5 after:bg-indigo-400 after:transition-all after:duration-300 hover:after:w-full\"][normalize-space()='About Us'])[1]")
	WebElement aboutus;
	
	@FindBy(xpath="(//input[@id='email'])[1]")
	WebElement email;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="(//button[normalize-space()='Sign In'])[1]")
	WebElement signbtn;
	
	@FindBy(xpath="(//a[normalize-space()='Voice Search'])[1]")
	WebElement voicesearch;
	
	@FindBy(xpath="(//a[normalize-space()='Restaurant Maps'])[1]")
	WebElement restaurantmaps;
	
	@FindBy(xpath="(//a[normalize-space()='AI Recommendations'])[1]")
	WebElement AIrecommendations;
	
	@FindBy(xpath="(//a[normalize-space()='Directions'])[1]")
	WebElement directions;
	
	@FindBy(xpath="(//a[normalize-space()='AiRecipeGenerator'])[1]")
	WebElement aiRecipeGenerator;
	
	@FindBy(xpath="(//a[normalize-space()='Privacy Policy'])[1]")
	WebElement privacypolicy;
	
	@FindBy(xpath="(//a[normalize-space()='Terms of Service'])[1]")
	WebElement termsofservice;
	
	@FindBy(xpath="(//a[normalize-space()='Contact Us'])[1]")
	WebElement contactus;
	
	@FindBy(xpath="(//a[normalize-space()='Chat Bot'])[1]")
	WebElement chatbot;
	
	@FindBy(xpath="(//*[name()='path'])[2]")
	WebElement twitter;
	
	@FindBy(xpath="(//*[name()='path'])[3]")
	WebElement linkedin;
	
	@FindBy(xpath="(//*[name()='svg'][@class='w-6 h-6'])[3]")
	WebElement github;
	
	public void Features() {
		features.click();
	}
	
	public void HowItWorks() {
		howItWorks.click();
	}
	
	public void Testimonials() {
		testimonials.click();
	}
	
	public void Mode() {
		mode.click();
	}
	
	public void getStarted() {
		getstarted.click();
	}
	
	public void backbtn() {
		backbtn.click();
	}
	
	public void About() {
		aboutus.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", aboutus);
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
	
	
	public void voiceSearch() {
		voicesearch.click();
	}
	
	public void restaurantMaps() {
		restaurantmaps.click();
	}
	
	public void AIreCommendations() {
		AIrecommendations.click();
	}
	
	public void Directions() {
		directions.click();
	}
	
	public void AiRecipeGenerator() {
		aiRecipeGenerator.click();
	}
	
	public void  privacyPolicy() {
		 privacypolicy.click();
	}
	
	public void  termsofService() {
		termsofservice.click();
	}
	
	public void  contactUs() {
		contactus.click();
	}
	
	public void  chatBot() {
		chatbot.click();
	}
	
	public void  Twitter() {
		twitter.click();
	}
	
	public void  linkedIn() {
		linkedin.click();
	}
	
	public void  gitHub() {
		github.click();
	}
	
	
	
	
	
	
	
	
}
