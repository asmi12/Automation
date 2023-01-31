import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdateDropdownValue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asmit\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// wait 5 sec on each and every line bcz it is global
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// implicit wait
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());// checkbox
																													// is
																													// selected
																													// or
																													// not

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();// by regular expression
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());// checkbox
																													// is
																													// selected
																													// or
																													// not
//		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
     {
	System.out.println("its enabled");
	Assert.assertTrue(true);
     }
     else
     {
    	 Assert.assertTrue(false);
     }
		
		
		
		// count total no. of checkboxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		Thread.sleep(2000);
//		int i=1;
//		while(i<6)
//		{		
//			
//			i++;
//		}

		for (int j = 1; j < 6; j++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
		Assert.assertEquals(driver.findElement(By.cssSelector("#divpaxinfo")).getText(), "6 Adult");
		System.out.println(driver.findElement(By.cssSelector("#divpaxinfo")).getText());
	}

}
