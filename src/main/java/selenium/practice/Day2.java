package selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day2 {

	//status of webelement
	//isSelected(), isEnabled(), isDisplayed()
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
       WebDriverManager.chromedriver().setup();
       WebDriver driver= new ChromeDriver();
       
       driver.get("https://demo.nopcommerce.com/register");
       
       System.out.println(driver.findElement(By.id("small-searchterms")).isDisplayed()); //true
       System.out.println(driver.findElement(By.id("small-searchterms")).isEnabled());   //true
       
       System.out.println(driver.findElement(By.id("gender-male")).isSelected());   //false
       
       driver.findElement(By.id("gender-male")).click();
       
       System.out.println(driver.findElement(By.id("gender-male")).isSelected()); //true
       
	}

}
