import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Check {
	public static void main(String[] args) {
{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asmit\\Documents\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
	driver.get("https://rahulshettyacademy.com");
	System.out.println(driver.getTitle());
//  Assert.assertTrue(driver.getTitle().matches("Rahul Shetty Academy"));

	}
}
}
