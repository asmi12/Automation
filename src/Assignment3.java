import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asmit\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(9));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("learning");
		driver.findElement(By.xpath("//label[@class='customradio'][2]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		WebElement dropdownOption = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select s = new Select(dropdownOption);
		s.selectByIndex(2);
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		
	w.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
	
	//adding all products (no need to create array)
		List<WebElement> products=driver.findElements(By.cssSelector(".btn.btn-info"));
		for(int i=0; i<products.size();i++)
		{
			products.get(i).click();
			
		}
		driver.findElement(By.partialLinkText("Checkout")).click();
		
	}

}
