import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropdownmenu {

	static
	{
		System.setProperty("webdriver.chrome.driver", "D:/QA/work/devrepublic/Selenium/selenium-java-2.52.0//chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","D:/Selenium/New folder/gecko//geckodriver.exe");
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.istqb.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//span[.='FOUNDATION']"));
		act.moveToElement(element).perform();
		Thread.sleep(1000);
		WebElement Enrol = driver.findElement(By.xpath("//span[.='ENROLLMENT']"));
		act.moveToElement(Enrol).perform();
		Thread.sleep(1000);
		WebElement corpoEnro = driver.findElement(By.xpath("//span[.='CORPORATE ENROLLMENT']"));
		act.moveToElement(corpoEnro).perform();
		Thread.sleep(1000);
		WebElement onlieEnro = driver.findElement(By.xpath("//span[.='ONLINE ENROLLMENT']"));
		act.moveToElement(onlieEnro).click().perform();
		driver.findElement(By.id("signin_username")).sendKeys("bhaumikpatel2392@gmail.com");
		driver.findElement(By.id("yespassword")).click();
		driver.findElement(By.id("signin_password")).sendKeys("abc");
		driver.findElement(By.id("signin_nxt")).click();
	}

}
