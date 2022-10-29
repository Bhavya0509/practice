package selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceopening {
	
	public static void main(String[] args) {
	
	 System.setProperty("webdriver.chrome.driver",
			 "C:\\Users\\2046171\\eclipse-workspace\\seleniumintro\\drivers\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://www.google.com/");
	}
}
