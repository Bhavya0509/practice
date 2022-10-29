package selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleDropdowns {

	//day 8
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://formstone.it/components/dropdown/demo/");
		
		WebElement basic = driver.findElement(By.id("demo_basic"));
		multipleDropDownsSelect(basic,"Two");
		
		
		WebElement cover = driver.findElement(By.id("demo_cover"));
		multipleDropDownsSelect(cover,"Four");
		
		
		}

	public static void multipleDropDownsSelect(WebElement element,String value) {
		
		Select s= new Select(element);
		List<WebElement> li= s.getOptions();
		
		for(WebElement option:li) {
			if(option.getText().equals(value)) {
				option.click();
				break;
			}
		}
		
	}
}
