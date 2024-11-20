package sidekick;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class create {

    public static void main(String[] args) {
        // Set up ChromeDriver path
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\dml-puneet\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

        // Initialize driver and navigate to the URL
        WebDriver driver = new ChromeDriver();
        driver.get("https://dev.everydayheroessrd.net/home");

        // Wait for up to 30 seconds for elements to be present
        WebDriverWait wait = new WebDriverWait(driver, 50);
        
//        driver.findElement(By.xpath("//button [text()='Sign In']")).click();
        

        try {
            // Wait for the username field to be visible and interactable
            WebElement usernameField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='username']")));
            usernameField.click();
            usernameField.sendKeys("qa@yopmail.com");

        } catch (org.openqa.selenium.TimeoutException e) {
            System.out.println("Element not found within the specified time.");
        } finally {
            // Close the driver after execution
            driver.quit();
        }
    
    
    
    }
}
