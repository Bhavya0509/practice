package selenium.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutosuggestiveDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bing.com/");
		
		driver.findElement(By.id("sb_form_q")).sendKeys("selenium");
		List<WebElement> li =driver.findElements(By.xpath("//li[@class='sa_sg']//span"));
		
		for(WebElement el:li) {
			if(el.getText().contains("webdriver")) {
				el.click();
				break;
			}
		}
	}

}
