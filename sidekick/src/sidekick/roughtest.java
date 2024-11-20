package sidekick;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class roughtest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\dml-puneet\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://dev.everydayheroessrd.net/home");
    	WebDriverWait wait = new WebDriverWait(driver, 30);

        

        try {
            // Replace with the actual shadow host selector
        	WebElement shadowHost = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("your-shadow-host-selector")));

            // Access the shadow root
            JavascriptExecutor js = (JavascriptExecutor) driver;
            WebElement shadowRoot = (WebElement) js.executeScript("return arguments[0].shadowRoot", shadowHost);

            // Replace with the actual element inside the shadow DOM
            WebElement usernameField = shadowRoot.findElement(By.cssSelector("your-shadow-element-selector")); 
            usernameField.sendKeys("qa@yopmail.com");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}
