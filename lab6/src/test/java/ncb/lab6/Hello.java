package ncb.lab6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hello {
	
	@Test
	public void test() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Temp\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://10.180.4.48:9081/collectionui");
		driver.manage().window().maximize();
		driver.findElement(By.name("loginForm:loginName")).sendKeys("keloths");
		driver.findElement(By.name("loginForm:password")).sendKeys("Pa$$w0rd");
		driver.findElement(By.id("loginForm:buttonlogin")).click();
		driver.findElement(By.className("EWLTGreen")).click();
		for(String winHandle : driver.getWindowHandles())
		{
		    driver.switchTo().window(winHandle);
		}

		driver.findElement(By.linkText("FinancialService/GetXLS.jsp")).click();
		
			}

}
