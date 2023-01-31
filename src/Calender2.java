import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asmit\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("onward_cal")).click();
		
		//! means True if an operand is false 
		//follwing condition is false but use ! it take as a true
		while(!driver.findElement(By.cssSelector(".monthTitle")).getText().contains("Jan 2025"))
			{
			driver.findElement(By.className("next")).click();
			}
		
		List<WebElement> dates=	driver.findElements(By.className("day"));
		
		int count=driver.findElements(By.className("day")).size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String text=driver.findElements(By.className("day")).get(i).getText();//27
			if(text.equalsIgnoreCase("27"))
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
	}

}
