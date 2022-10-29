package selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\2046171\\eclipse-workspace\\seleniumintro\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hdfcbank.com/");
		
		//product type
		driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
		List<WebElement> li=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li"));
		
		for(WebElement value:li) {
			if(value.getText().equals("Accounts")) {
				value.click();
				break;
			}
		}
		
		//product
		
		driver.findElement(By.xpath("//div[@class='drp2']//div[@class='dropdown']")).click();
		List<WebElement> li1=driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']//li"));
		
		for(WebElement value:li1) {
			if(value.getText().equals("Salary Accounts")) {
				value.click();
				break;
			}
		}
	}

}
