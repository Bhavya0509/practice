package selenium.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingJqueryDropdown {
	// day 10

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();

		driver.findElement(By.id("justAnInputBox")).click();

		//selectChoiceValues(driver, "choice 1");
		// selectChoiceValues(driver,"choice 1,choice 2,choice 3");
		 selectChoiceValues(driver,"all");

	}
	// we use this String.... because size is not defined

	public static void selectChoiceValues(WebDriver driver, String... value) {

		List<WebElement> choices = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));

		if (!value[0].equalsIgnoreCase("all")) {

			for (WebElement item : choices) {
				String text = item.getText();

				for (String val : value) {
					if (text.equals(val)) {
						item.click();
						break;
					}
				}
			}
		} else {
			try {
				for (WebElement item : choices) {
					item.click();
				}
			} catch (Exception e) {

			}
		}

	}
}
