package com.Pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericFunctions;
import com.GenericFunctions.Login;

public class TC01 extends GenericFunctions {

	@Test
	public static void TC01() {
		GenericFunctions gnf = new GenericFunctions();
		gnf.Launchapp("Firefox", "http://www.testingmasters.com/hrm");

		// Login lg = new Login();
		// lg.
		//
		Login l = PageFactory.initElements(driver, Login.class);
		l.application();

	}
}
