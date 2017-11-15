import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Contextclick_rightclick {

	static
	{
		System.setProperty("webdriver.chrome.driver", "D:/QA/work/devrepublic/Selenium/selenium-java-2.52.0//chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","D:/Selenium/New folder/gecko//geckodriver.exe");
	}
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement link = driver.findElement(By.xpath("//a[contains(., 'Inc')]"));
		Actions act = new Actions(driver);
		
		//composite click 
		act.sendKeys(Keys.CONTROL).click(link).perform();
		act.contextClick(link).build().perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
	
		}

}
