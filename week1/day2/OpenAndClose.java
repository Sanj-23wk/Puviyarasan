package week1.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenAndClose {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window(). maximize ();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")) .sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("PUVIY");
		driver.findElement(By.id("lastNameField")).sendKeys("ARASAN");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
}
}
