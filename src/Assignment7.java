import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asmit\\Documents\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement getTable =driver.findElement(By.id("product"));
		System.out.println(driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).size());
		System.out.println("Total Number of Rows:" +getTable.findElements(By.tagName("tr")).size());
		System.out.println("Total Number of Columns:" +getTable.findElements(By.tagName("th")).size());
		List<WebElement>secondRow=driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr[3]/td"));
				for(int i=0;i<secondRow.size();i++)
				{
					System.out.println(secondRow.get(i).getText());
			
				
				}
				 
		
	}

}
