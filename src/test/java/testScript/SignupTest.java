package testScript;

import org.testng.annotations.Test;

import baseClass.BaseClass;
import pageObject.SignUp;

public class SignupTest extends BaseClass {

	@Test
	public void signUp() {
		
		SignUp signup = new SignUp(driver);
		signup.signIn();
		signup.signUp();
		signup.userName("Shubham Giri");
		signup.Email("shubhamgiri1709@gmail.com");
		signup.Password("Shubham23");
		signup.confirmPassword("Shubham23");
		signup.createAccount();
		
	}
	
	@Test
	public void signUpwithemptymail() {
		
		SignUp signup = new SignUp(driver);
		signup.signIn();
		signup.signUp();
		signup.userName("Shubham Giri");
		signup.Email("");
		signup.Password("Shubham23");
		signup.confirmPassword("Shubham23");
		signup.createAccount();
		
	}
	
	@Test
	public void signUpwithnotusespecialsymbol() {
		
		SignUp signup = new SignUp(driver);
		signup.signIn();
		signup.signUp();
		signup.userName("Shubham Giri");
		signup.Email("shubhamgiri1709gmail.com");
		signup.Password("Shubham23");
		signup.confirmPassword("Shubham23");
		signup.createAccount();
		
	}
	
	@Test
	public void signUpwithemptyusername() {
		
		SignUp signup = new SignUp(driver);
		signup.signIn();
		signup.signUp();
		signup.userName("Shubham Giri");
		signup.Email("shubhamgiri1709@gmail.com");
		signup.Password("Shubham23");
		signup.confirmPassword("Shubham23");
		signup.createAccount();
		
	}
	
	@Test
	public void signUpwithemptypassword() {
		
		SignUp signup = new SignUp(driver);
		signup.signIn();
		signup.signUp();
		signup.userName("Shubham Giri");
		signup.Email("shubhamgiri1709@gmail.com");
		signup.Password("");
		signup.confirmPassword("shubham23");
		signup.createAccount();
		
	}
	
	@Test
	public void signUpwithemptyconfirmpassword() {
		
		SignUp signup = new SignUp(driver);
		signup.signIn();
		signup.signUp();
		signup.userName("Shubham Giri");
		signup.Email("shubhamgiri1709@gmail.com");
		signup.Password("Shubham23");
		signup.confirmPassword("");
		signup.createAccount();
		
	}
}
