package Test_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_automation_class {

	public static void main(String[] args) {
		String Chrome_driver_path = "C:\\Users\\Zeeshan\\eclipse-workspace\\Test_Application\\chromedriver_latest\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",Chrome_driver_path);
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@title=\"Search\"]")).sendKeys("Save this code please");
		

	}

}
