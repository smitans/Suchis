package utility;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;
import javax.imageio.ImageIO;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Generic {
	
 public static void Drop_Down(WebElement we,String expectedData)
 {
	Select sc=new Select(we);
	List<WebElement> list=sc.getOptions();
	for(WebElement op:list)
	{
		String text=op.getText();
		
		if(text.contains(expectedData))
		{
			sc.selectByVisibleText(text);
			break;
		}
	}
	 
 }
 public static void screenshot(String name) 
 {
	 try {
		Robot r=new Robot();
		 BufferedImage bi=r.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		 ImageIO.write(bi, "png", new File("./screenshots/"+name+".png"));
	} catch (Exception e) {
		
	}
 }
 
 
 
 
 
}
