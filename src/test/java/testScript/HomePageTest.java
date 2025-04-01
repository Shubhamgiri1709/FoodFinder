package testScript;

import org.testng.annotations.Test;

import baseClass.BaseClass;
import pageObject.HomePage;

public class HomePageTest extends BaseClass {
	@Test
	public void homepage() {
		HomePage homepage = new HomePage(driver);
		
		homepage.Features();
		homepage.HowItWorks();
		homepage.Testimonials();
		homepage.Mode();
		homepage.getStarted();
		homepage.backbtn();
      	homepage.About();
		homepage.voiceSearch();
		homepage.restaurantMaps();
		homepage.AIreCommendations();
		homepage.Directions();
		homepage.AiRecipeGenerator();
		homepage.privacyPolicy();
		homepage.termsofService();
		homepage.contactUs();
		homepage.chatBot();
		homepage.Twitter();
		homepage.linkedIn();
		homepage.gitHub();
	}

}
