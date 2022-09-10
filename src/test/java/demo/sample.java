package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sample 
{
	@Test
	public void m1()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Viswajit\\Downloads"
				+ "\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("hii");
	}

}
