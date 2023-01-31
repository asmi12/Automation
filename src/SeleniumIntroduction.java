import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) {

//Invoking Browser

//Chrome - ChromeDriver exten->Methods close get

//Firefox- FirefoxDriver ->methods close get

// WebDriver  close  get

//WebDriver methods + class methods

// Chrome

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asmit\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");

//Firefox

//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\asmit\\Documents\\geckodriver.exe");
//
//		WebDriver driver1 = new FirefoxDriver();
//
////Microsoft Edge
//
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\asmit\\Documents\\msedgedriver.exe");
//
//		WebDriver driver2 = new EdgeDriver();
//
//		driver.get("https://rahulshettyacademy.com");

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		driver.close();

//driver.quit();

	}

}
