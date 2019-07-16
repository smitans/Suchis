package testBase;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Base {
	public static WebDriver driver;
	static Properties property;
   public static void loadproperty()
   {
		try {
			File f=new File(".\\src\\main\\java\\configuration\\OR.properties");
			FileReader fr=new FileReader(f);
			property=new Properties();
			property.load(fr);
		} catch (Exception e) {
			e.printStackTrace();
		} 
   }
  
	
    public static By getElement(String key)
    {
	By loc=null;
	loadproperty();
	String value = property.getProperty(key);
	String loctype=value.split(":")[0];
	String locvalue=value.split(":")[1];
	switch(loctype)
	{
		case "name":
		loc=By.name(locvalue);
		break;
		case "id":
		loc=By.id(locvalue);
		break;
		case "class":
		loc=By.className(locvalue);
		break;
		case "linkText":
		loc=By.linkText(locvalue);
		break;
		case "tagname":
		loc=By.tagName(locvalue);
		break;
		case "cssSelector":
		loc=By.cssSelector(locvalue);
		break;
		case "partialLinkText":
		loc=By.partialLinkText(locvalue);
		break;
		case"xpath":
	    loc=By.xpath(locvalue);
	    break;
	}
	return loc;
    }
    public static void loadpropertyconfig()
    {
    	try {
			File f=new File(".\\src\\main\\java\\configuration\\config.properties");
			FileReader fr=new FileReader(f);
			property=new Properties();
			property.load(fr);
		} catch (Exception e) {
			e.printStackTrace();
		} 
    }
    public static String getConfig(String key)
    {
  	  loadpropertyconfig();
  	  String value= property.getProperty(key);
  	  return value;
    }
}
