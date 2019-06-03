package LaunchChromeDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeDemo {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","./src/chromedriver.exe");	// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/User/Desktop/BasicHTML.html");
	driver.manage().window().maximize();
	WebElement untxtbx=driver.findElement(By.name("username"));
	untxtbx.sendKeys("shivam");
	WebElement ppp=driver.findElement(By.name("pwd"));
	ppp.sendKeys("jdfkasfjaskfjsa;lfaslfsa;lfas;lflfsafa;ls");
	}

}