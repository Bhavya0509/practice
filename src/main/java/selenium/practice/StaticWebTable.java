package selenium.practice;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\2046171\\eclipse-workspace\\seleniumintro\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//1. print all rows
		
		int rows=driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr")).size();
		System.out.println("Number of rows :- "+rows);
		
		//2. print all columns
		
		int cols =driver.findElements(By.xpath("//div[@class='tableFixHead']/table/thead/tr/th")).size();
		System.out.println("Number of cols :- "+cols);
		
		//3. specific row/column data
		
		System.out.println(driver.findElement(By.xpath("//div[@class='tableFixHead']/table/tbody/tr[2]/td[1]")).getText());
		
		// 4. printing all table data
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=cols;j++) {
				System.out.print(driver.findElement(By.xpath("//div[@class='tableFixHead']/table/tbody/tr["+i+"]/td["+j+"]")).getText()+"  ");
				
			}
			System.out.println();
		}
	}

}
