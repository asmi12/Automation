import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GreenCartAddItem {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot", "Mango" };
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asmit\\Documents\\chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
		//implicit wait---implicityl wait declare on global level
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//explicit wait
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		addItem(driver, itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
//		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoCode")));


		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
	}

	public static void addItem(WebDriver driver, String[] itemsNeeded) {
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		int j = 0;
		for (int i = 0; i < products.size(); i++) {

//			Brocolli - 1 Kg
			// After split
			// 0--Brocoli
			// 1-- 1kg

			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			// check whether name you extracted is present or not
			// convert array to arrayList for easy Search
			List<String> ItemsNeededList = Arrays.asList(itemsNeeded);
			if (ItemsNeededList.contains(formattedName)) {
				j++;
				// text is dynamic
//				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();// by using text value write xpath
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemsNeeded.length) {
					break;
				}
			}
		}
	}

}
