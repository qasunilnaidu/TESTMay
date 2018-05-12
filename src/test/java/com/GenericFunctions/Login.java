package com.GenericFunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericFunctions;

public class Login extends GenericFunctions{
	
	//Username
	@FindBy(how=How.ID , using="txtUsername")
	WebElement Username;
	
	//Password
	@FindBy(how=How.ID , using="txtPassword")
	WebElement Password;
	
	//Login
	@FindBy(how=How.ID , using="btnLogin")
	WebElement Login;
	
	
	public  void  application(){
		
		Username.click();
		Username.clear();
		setText(Username, "user01");
		Password.click();
		Password.clear();
		setText(Password, "pass1234");

	}


}
