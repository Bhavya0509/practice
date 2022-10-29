package selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {
	
	//day 8

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\2046171\\eclipse-workspace\\seleniumintro\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");

		WebElement dropdown = driver.findElement(By.id("input-country"));
		
		Select options = new Select(dropdown);
		
		//options.selectByIndex(1);
		
		//options.selectByValue("6");
		
		//options.selectByVisibleText("Denmark");
		
		
		//selecting the values without using method
		 
		List<WebElement> li =options.getOptions();
		
		for(WebElement value:li) {
			if(value.getText().equals("Cuba")) {
				value.click();
				break;
			}
		}
		
		
	}

}
