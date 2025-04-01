package testScript;

import org.testng.annotations.Test;

import baseClass.BaseClass;
import pageObject.TryNow;

public class TryNowTest extends BaseClass{

	@Test
	public void AddtocartProcess() {
		TryNow cart = new TryNow(driver);
		
		cart.tryNow();
		cart.Email("shubhamgiri1709@gmail.com");
		cart.Passoword("shubham23");
		cart.signBtn();
		cart.Search("What restaurants are nearby?");
		cart.searchBtn();
		cart.mapView();
		cart.voiceView();
		
	}
}
