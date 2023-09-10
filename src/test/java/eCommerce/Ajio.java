package eCommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Ajio {
	public void AjioTest() {
		 Reporter.log("Opening Ajio",true);
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.ajio.com/");
		 driver.quit();
	}
}
