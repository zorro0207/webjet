package org.page.manager;

import org.pages.Adelaide;
import org.pages.FlightSearchPage;

public class PageObjectManager {

	private FlightSearchPage fp;
	private Adelaide ade;

	public FlightSearchPage getFp() {
		return (fp==null)?fp=new FlightSearchPage():fp;
	}

	public Adelaide getAde() {
		return (ade==null)?ade=new Adelaide():ade;
	}
	
	
	
	
}
