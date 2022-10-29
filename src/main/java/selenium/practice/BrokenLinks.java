package selenium.practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(int i=0;i<links.size();i++) {
			String linkText = links.get(i).getAttribute("href");
			
			URL url=new URL(linkText);
			HttpURLConnection conn= (HttpURLConnection)url.openConnection();
			conn.connect();
			if(conn.getResponseCode()>400) {
				System.out.println(links.get(i).getText()+" is broken.");
			}
			else {
				System.out.println(links.get(i).getText()+" is not broken.");
			}
		}
	}

}
