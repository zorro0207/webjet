package org.stepdef;

import java.util.concurrent.TimeUnit;

import org.base.LibGlobal;
import org.junit.Before;

public class Hooks extends LibGlobal {
	@Before
	public void before() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		
	}
	

}
