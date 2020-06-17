package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.Auto_constant;
import generics.Base_page;
import generics.Excel_library;


public class PomSampleHtml extends Base_page implements Auto_constant{
@FindBy(xpath="(//input[@type='text'])[1]")
private WebElement fname;

@FindBy(xpath="(//input[@type='text'])[2]")
private WebElement lname;
@FindBy(xpath="(//input[@type='text'])[3]")
private WebElement user;
@FindBy(xpath="//input[@type='password']")
private WebElement pass;
@FindBy(xpath="(//input[@type='text'])[4]")
private WebElement email;
@FindBy(xpath="(//input[@type='text'])[5]")
private WebElement mob;
@FindBy(xpath="(//input[@type='radio'])[1]")
private WebElement clickm;
@FindBy(xpath="//input[@type='checkbox']")
private WebElement remember;
@FindBy(xpath="//select[@name='countrycode']")
private WebElement countrycode;
@FindBy(xpath="//textarea")
private WebElement adress;
@FindBy(xpath="//input[@type='button']")
private WebElement save;


public PomSampleHtml(WebDriver d)
{
PageFactory.initElements(d,this);	
}

public void start() throws IOException, InterruptedException
{
Thread.sleep(3000);
    fname.sendKeys(Excel_library.get(1,0));
  lname.sendKeys(Excel_library.get(1,1));
	user.sendKeys(Excel_library.get(1,2));
	pass.sendKeys(Excel_library.get(1,3));
	email.sendKeys(Excel_library.get(1,4));
	mob.sendKeys(Excel_library.get(1,5));
	clickm.click();
    adress.sendKeys(Excel_library.get(1,6));
   
    
    save.click();
	
}

}