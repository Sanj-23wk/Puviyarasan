package week1.day2;

import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Setup {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver =new FirefoxDriver();

		driver.get("");
	}
}