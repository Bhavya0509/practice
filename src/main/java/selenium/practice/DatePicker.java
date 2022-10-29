package selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("onward_cal")).click();
		
		String month="July";
		String date="23";
		String year="2022";
		
		while(true) {
			String monthYear=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			String[] ar=monthYear.split(" ");
			String mon=ar[0];
			String yr=ar[1];
			
			if(month.equalsIgnoreCase(mon) && year.equals(yr)) {
				List<WebElement> dates=driver.findElements(By.className("day"));
				
				for(WebElement specific_date:dates) {
					if(specific_date.getText().equals(date)) {
						specific_date.click();
						break;
					}
				}
			
			}
			else {
				driver.findElement(By.xpath("//td[@class='next']")).click();
			}
		}

	}

}
