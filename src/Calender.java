import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asmit\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		JavascriptExecutor executor = (JavascriptExecutor) driver;

		executor.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
     	driver.findElement(By.cssSelector("input[id='form-field-travel_comp_date']")).click();
    	Thread.sleep(3000);

	    while (!driver.findElement(By.xpath("//div[@class='flatpickr-month']")).getText().contains("June")) 
	    {
		
				driver.findElement(By.xpath("//span[@class ='flatpickr-next-month']")).click();
		
				}
	Thread.sleep(3000);
//		//first grab the date
		List<WebElement> dates = driver.findElements(By.className("flatpickr-day"));
		// Grab common attribute//Put into list and iterate
		int count = driver.findElements(By.cssSelector(".flatpickr-day ")).size();

		for (int i = 0; i < count; i++) {
			// we get date as a text example ---21,22,31
			 String text=driver.findElements(By.cssSelector(".flatpickr-day ")).get(i).getText();

		     if(text.equalsIgnoreCase("02"))

		     {

		    	 driver.findElements(By.cssSelector(".flatpickr-day ")).get(i).click();



		    	 break;

		    	 }



		    	 }

		    	 Thread.sleep(3000);

	}
}
