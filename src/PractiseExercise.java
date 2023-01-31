import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asmit\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//get count of all links present on page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//get count of links present on footer
		WebElement footerdriver= driver.findElement(By.id("gf-BIG"));//limiting webdriver scope
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//fetch count on first section on present on footer
		WebElement columnDriver =footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		
		//click on each link in column and check links are working
		for(int i=0;i<columnDriver.findElements(By.tagName("a")).size();i++)
		{
			
			//open link on another tab
			String clickOnLinkTab= Keys.chord(Keys.CONTROL,Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			
		}//open link on tab
		
		
		//get title of each tab
			Set<String> abc =driver.getWindowHandles();
			Iterator<String>it = abc.iterator();
			
			//hasNext====check next index is present or not
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
		
	}

}
