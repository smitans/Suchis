package com.library.com.RanFordBank;

import org.openqa.selenium.WebElement;

import testBase.Base;

public class BranchesPage extends Base {
	 public static WebElement Home_btn()
	 {
		 return	 driver.findElement(getElement("Home"));
	 }
	 public static WebElement ChangePassword_btn()
	 {
		 return driver.findElement(getElement("ChangePassword"));
	 }
	 public static WebElement Logout_btn()
	 {
		 return driver.findElement(getElement("Logout"));
	 }
	 public static WebElement NewBranch_btn()
	 {
		 return driver.findElement(getElement("NewBranch"));
	 }
	 public static WebElement Country_dropdown()
	 {
		 return driver.findElement(getElement("CountryS"));
	 }
	 public static WebElement State_dropdown()
	 {
		 return driver.findElement(getElement("StateS"));
	 }
	 public static WebElement City_dropdown()
	 {
		 return driver.findElement(getElement("CityS"));
	 }
	 public static WebElement Search_btn()
	 {
		 return driver.findElement(getElement("Search"));
	 }
	 public static WebElement Clear_btn()
	 {
		return driver.findElement(getElement("Clear"));
	 }
}
