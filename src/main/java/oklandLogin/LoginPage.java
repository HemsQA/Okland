package oklandLogin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mobile Programming\\OneDrive\\Desktop\\HK\\Softech\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Open OakLand URL

		driver.get("https://oaklandportalstage.portofoakland.com/#/userLogin");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Get URL title
		System.out.println(driver.getTitle());
//Enter Username 

		driver.findElement(By.id("email")).sendKeys("madhavtestbuyerNMDC@fexpost.com");

		// Enter Password

		driver.findElement(By.id("password")).sendKeys("m5HZMG@e");

		// click on Login button
		WebElement Register = driver.findElement(By.xpath("//button[@class='btn btn-primary login-btn btn-block']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,100)");
		js.executeScript("arguments[0].click();", Register);

		// Click on View Profile

		driver.findElement(By.xpath("//a[@class='btn primary']")).click();
		
		driver.quit();

	}

}
