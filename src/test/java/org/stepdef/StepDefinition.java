package org.stepdef;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.lang.annotation.Target;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.base.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.page.manager.PageObjectManager;
import org.pages.FlightSearchPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends LibGlobal {
	public static final String USERNAME = "praveenarajendra1";
	public static final String AUTOMATE_KEY = "8QuqxXapFv3SGdZvSxTx";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	PageObjectManager page = new PageObjectManager();
	
	

	Robot r;

	@Given("the user move the cursor to flight tab")
	public void theUserMoveTheCursorToFlightTab() {
		launchBrowser();

	}

	@When("i need to verify that user is able to see list of locations that flight can travel")
	public void iNeedToVerifyThatUserIsAbleToSeeListOfLocationsThatFlightCanTravel() {
		WebElement flight = page.getFp().getFlight();
		movetoElement(flight);
	}

	@Then("i need to verify that user is able to click domestic flight location")
	public void iNeedToVerifyThatUserIsAbleToClickDomesticFlightLocation() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);

		WebElement domesticFlight = page.getFp().getDomesticFlight();
		click(domesticFlight);
	}

	@Given("i need to verify that user is able to enter {string}")
	public void iNeedToVerifyThatUserIsAbleToEnter(String sourceCity) throws AWTException {
		
		driver.navigate().refresh();

		fill(page.getAde().getSource(), sourceCity);
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	@When("i need to verify that user is able to select the TRAVEL DATE")
	public void iNeedToVerifyThatUserIsAbleToSelectTheTRAVELDATE() throws AWTException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);

		click(page.getAde().getTravelDate());

		List<WebElement> tableApril = page.getAde().getTableApril();
		System.out.println(tableApril.size());

		
		for (int i = 0; i < tableApril.size(); i++) 
		{
			WebElement eachdata =  tableApril.get(i);
			String text = eachdata.getText();
			System.out.println(text);
			if (text.contains("18"))
			
			{
				click(eachdata);
				System.out.println("clicked");
				
				List<WebElement> tableApril2 = page.getAde().getTableApril2();
				
				System.out.println(tableApril2.size());
				for (int j = i+1; j < tableApril2.size(); j++) 
				{
					WebElement eachdata2 =  tableApril2.get(j);
					String text2 = eachdata2.getText();
					System.out.println(text2);
					Thread.sleep(2000);
					if (text2.contains("23"))
						
					{
						click(eachdata2);
						System.out.println("clicked");
			
		         	
						break;
					}
			
			

				}
		
		break;
		}
		}
		

	}

	@When("i need to verify that user is able to select the noOfAdults , noOfchild, noOfInfants")
	public void iNeedToVerifyThatUserIsAbleToSelectTheNoOfAdultsNoOfchildNoOfInfants() throws AWTException {

		click(page.getAde().getNoOfpassager());
		click(page.getAde().getNoOfAdults());
		click(page.getAde().getNoOfChildren());
		click(page.getAde().getNoOfInfants());
		// click(page.getAde().getNoOfAdults());

		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	@When("i need to verify that user is able to select the {string}")
	public void iNeedToVerifyThatUserIsAbleToSelectThe(String seatClass) {

		click(page.getAde().getSeatClass());
		movetoElement(driver.findElement(By.name(seatClass)));
		doubleclick(driver.findElement(By.name(seatClass)));

	}

	@Then("i need to verify that user s able to click Search Flight button")
	public void iNeedToVerifyThatUserSAbleToClickSearchFlightButton() {
		click(page.getAde().getSearchFlight());

	}

}
