package selinium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;

public class LaunchTheBrowser {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window(). maximize ();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")) .sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("CRM/SFA")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("PUVIYARASAN");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("SANJAY");

        driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("PUVIY");
        driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("ARASAN");
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("SELENIUM");
        driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium WebDriver is a tool used for automating web application testing. It simulates a user interacting with a web browser in order to test the functionality of the web application.");
        
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("demosalesmanager@gmail.com");
        
        driver.findElement(By.name("submitButton")).click();
        System.out.println(driver.getTitle());
	}
}
