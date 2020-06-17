package generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest implements Auto_constant{
	public WebDriver d;
	@BeforeClass
	public void OpenBrowser()
	{
		System.setProperty(chrome_key,chrome_value);
       d=new ChromeDriver();
       d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       d.manage().window().maximize();
       d.get(url);
       
	
	}
@AfterClass
	public void closethis() throws InterruptedException
	{Thread.sleep(5000);
		d.close();
	}

}
