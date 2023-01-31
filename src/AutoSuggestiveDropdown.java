import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asmit\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		// to capture list
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

//		for (WebElement option : options) {
//			System.out.println(option);
//			if (option.getText().equalsIgnoreCase("india")) {
//				option.click();
//				break;
//			}
//		}
//
//	}

	for(int i=0;i<options.size();i++)
	{
		WebElement opt= options.get(i);
		String text= opt.getText();
		if(text.equalsIgnoreCase("india"))
		{
		opt.click();
		break;
		}
		
	
	}
}
}
