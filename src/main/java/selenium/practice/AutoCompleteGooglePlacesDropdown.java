package selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoCompleteGooglePlacesDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
		
		WebElement search =driver.findElement(By.id("autocomplete"));
		search.clear();
		search.sendKeys("Toronto");
		
		String text;
		do {
			
			search.sendKeys(Keys.ARROW_DOWN);
			text=search.getAttribute("placeholder");
			
			if(text.equals("Toronto,ON,Canada")) {
				search.sendKeys(Keys.ENTER);
				break;
			}
			
			
		}while(!text.isEmpty());

	}

}
