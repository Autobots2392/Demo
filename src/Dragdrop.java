import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {
	static
	{
		System.setProperty("webdriver.chrome.driver", "D:/QA/work/devrepublic/Selenium/selenium-java-2.52.0//chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","D:/Selenium/New folder/gecko//geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		//driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		driver.manage().window().maximize();
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dest = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		//act.dragAndDrop(src, dest).perform();
		act.clickAndHold(src).moveToElement(dest).click().perform();
		Thread.sleep(5000);
		driver.close();
}



}
