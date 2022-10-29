package selenium.practice;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChecksortedoptionsDay11 {
	
	// We need to check if drop downs are sorted or not.
	// for that we need to find options and store them in two lists orginal and temporary lists.
	// then we will sort temporary lists and then compare the original list and sorted temporary list.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
		
		WebElement ele =driver.findElement(By.name("category_id"));
		Select s=new Select(ele);
		
		List<WebElement> li= s.getOptions();
		
		ArrayList original_list = new ArrayList();
		ArrayList temporary_list = new ArrayList();
		
		for(WebElement options:li) {
			original_list.add(options.getText());
			temporary_list.add(options.getText());
		}
		
		Collections.sort(temporary_list);
		
		if(original_list.equals(temporary_list)) {
			System.out.println("drop down is sorted");
		}
		else {
			System.out.println("drop down is not sorted");
		}
	}

}
