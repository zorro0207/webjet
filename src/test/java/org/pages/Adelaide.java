package org.pages;

import java.lang.annotation.Target;
import java.util.List;

import org.base.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Adelaide extends LibGlobal {
	public Adelaide() {
		PageFactory.initElements(driver,this);
		}
	
	@FindBy(id="departure-airport")
	private WebElement Source1;
	
	@FindBy(id="ft-dates-return")
	private WebElement travelDate;
	
	
	@FindBy(xpath="(//table[@class='ui-zsl-date-picker-calendar'])[2]/tbody/tr/td")
	private  List<WebElement> tableApril;
	
	@FindBy(xpath="(//table[@class='ui-zsl-date-picker-calendar'])[4]/tbody/tr/td")
	private  List<WebElement> tableApril2;
	
	
	@FindBy(id="button-passengers")
	private WebElement noOfpassager;
	
	public List<WebElement> getTableApril2() {
		return tableApril2;
	}

	@FindBy(xpath="(//button[@value='+'])[1]")
    private WebElement noOfAdults;
	
	@FindBy(xpath="(//button[@value='+'])[3]")
    private WebElement noOfInfants;
	
	@FindBy(xpath="(//button[@value='+'])[2]")
    private WebElement noOfChildren;
	
	@FindBy(id="zsl-button-flight-cabin-class")
	private WebElement seatClass;
	
	
	@FindBy(id="span-search-text-enabled")
	private WebElement searchFlight;
	

	public List<WebElement> getTableApril() {
		return tableApril;
	}

	
	public WebElement getNoOfAdults() {
		return noOfAdults;
	}

	public WebElement getNoOfInfants() {
		return noOfInfants;
	}

	public WebElement getNoOfChildren() {
		return noOfChildren;
	}

	

	public WebElement getSource() {
		return Source1;
	}

	public WebElement getSearchFlight() {
		return searchFlight;
	}

	public WebElement getTravelDate() {
		return travelDate;
	}

	public WebElement getNoOfpassager() {
		return noOfpassager;
	}

	public WebElement getSeatClass() {
		return seatClass;
	}
	
	
	
	
	

}
