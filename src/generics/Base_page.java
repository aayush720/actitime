package generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_page {
	
	public void selectByVisibleText(WebElement e,String text)

	{
		Select s=new Select(e);
		s.selectByVisibleText(text);
	}
	
	public void selectByIndex(WebElement e,int index)
	{
		Select s=new Select(e);
		s.selectByIndex(index);
	}
	
	public void click(WebDriver driver,WebElement e)
	{
		Actions a=new Actions(driver);
		a.click(e).perform();
		
	}
}
