package selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		//1. select specific checkbox
		
		//driver.findElement(By.id("monday")).click();
		
		//2. select multiple checkboxes
		
	 List<WebElement> choices =driver.findElements(By.xpath("//div[@class='form-check']/label/input[@type='checkbox']"));
     /* for(WebElement ele:choices) {
    	  ele.click();
      }*/
      
      //3. choosing multiple checkboxes by choice
      
    /* for(WebElement ele:choices) {
    	 if(ele.getAttribute("id").equals("monday") || ele.getAttribute("id").equals("thursday")) {
    		 ele.click();
    	 }
     }*/
     
     //4.selecting last two checkboxes
	/*int start =choices.size()-2;
	for(int i=start;i<choices.size();i++) {
		choices.get(i).click();
	}*/
	 
	 //5. selecting first two checkboxes
	 
	 for(int i=0;i<choices.size();i++) {
		 if(i<2) {
		 choices.get(i).click();
		 }
	 }
	 
	}
	
}
