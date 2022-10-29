package selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\2046171\\eclipse-workspace\\seleniumintro\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://text-compare.com/");
		WebElement box1=driver.findElement(By.id("inputText1"));
		box1.sendKeys("Welcome");
		box1.sendKeys(Keys.chord(Keys.CONTROL,Keys.chord("a")));
		box1.sendKeys(Keys.chord(Keys.CONTROL,Keys.chord("c")));
		
		Actions c = new Actions(driver);
		c.sendKeys(Keys.TAB).build().perform();
		
		WebElement box2=driver.findElement(By.id("inputText2"));
		box2.sendKeys(Keys.chord(Keys.CONTROL,Keys.chord("v")));
		
		
		

	}

}
