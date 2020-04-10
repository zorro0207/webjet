package org.pages;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightSearchPage extends LibGlobal {
	
	
	public FlightSearchPage() {

	PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//div[text()='Flights']")
	private WebElement flight;
	@FindBy(xpath="(//a[text()='Adelaide'])[2]")
	private WebElement domesticFlight;
	


	public WebElement getDomesticFlight() {
		return domesticFlight;
	}



	public WebElement getFlight() {
		return flight;
	}
	
	
	
	
	
	

}
