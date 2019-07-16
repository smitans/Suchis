package com.library.com.RanFordBank;

import org.openqa.selenium.WebElement;

import testBase.Base;

public class UserPage extends Base {
	public static WebElement NewUser_btn()
	 {
		 return driver.findElement(getElement("NewRole"));
	 }
}
