package testScript;

import org.testng.annotations.Test;

import baseClass.BaseClass;
import pageObject.SignIn;

public class SignInTest  extends BaseClass{
    
	@Test
	public void loginwithvalidcardentials() {
		SignIn login = new SignIn(driver);
		login.signIn();
		login.Email("shubhamgiri1709@gmail.com");
		login.Passoword("shubham23");
		login.signBtn();
		
	}
	
	@Test
	public void loginwithinvalidcardentials() {
		SignIn login = new SignIn(driver);
		login.signIn();
		login.Email("shubhamgiri17@gmail.com");
		login.Passoword("shubham23");
		login.signBtn();
		
	}
	
	@Test
	public void loginwithinvalidcardentialsemptyemail() {
		SignIn login = new SignIn(driver);
		login.signIn();
		login.Email("");
		login.Passoword("shubham23");
		login.signBtn();
		
	}
	
	@Test
	public void loginwithinvalidcardentialswithemptypassword() {
		SignIn login = new SignIn(driver);
		login.signIn();
		login.Email("shubhamgiri1709@gmail.com");
		login.Passoword("");
		login.signBtn();
		
	}
	
	@Test
	public void loginwithemptycardentials() {
		SignIn login = new SignIn(driver);
		login.signIn();
		login.Email("");
		login.Passoword("");
		login.signBtn();
		
	}
}
