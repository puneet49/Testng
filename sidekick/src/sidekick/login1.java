package sidekick;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\dml-puneet\\\\Downloads\\\\chromedriver-win64 (1)\\\\chromedriver-win64\\\\chromedriver.exe");
		// driver initialization
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait =  new WebDriverWait(driver,20);
		// go to the webapp link
		driver.get("https://dev.everydayheroessrd.net");
		driver.manage().window().maximize();
//		driver.findElement("")args.cl
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		
		List <WebElement> username =wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@id='signInFormUsername']")));
		driver.findElement(By.xpath("//input[@id='signInFormUsername']")).click();
		driver.quit();
}
	}


