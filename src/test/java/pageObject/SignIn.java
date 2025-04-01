package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;

public class SignIn  {
	WebDriver driver;
	
	//constructor
	
	   public SignIn(WebDriver driver)
		 {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		//Locator
	   //click on user
		@FindBy(xpath="//a[normalize-space()='Sign In']")
		WebElement signin;
		
		
		@FindBy(xpath="(//input[@id='email'])[1]")
		WebElement email;
		
		@FindBy(xpath="//input[@id='password']")
		WebElement password;
		
		@FindBy(xpath="(//button[normalize-space()='Sign In'])[1]")
		WebElement signbtn;
		
		
		
		
		public void signIn() {
			signin.click();
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
		
		
		
		
		
}
