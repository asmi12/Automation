import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDrpddown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asmit\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// wait 5 sec on each and every line bcz it is global
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// implicit wait
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BHO']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();//we write indexing xpath because DEL value present on departure 
//		and arrival and we want only arrival value so we write 2
//		in future if we want 5th index value of DEL thern we write 5
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();//to avoid indexing we also use parent child relationship xpath
//		Thread.sleep(2000);
		driver.findElement(By.xpath(".ui-state-default.ui-state-highlight.ui-state-active.ui-state-hover']")).click();
	
	}

}
