import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asmit\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Asmita");
		driver.findElement(By.name("email")).sendKeys("asmita@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("12345678");
		driver.findElement(By.cssSelector("#exampleCheck1")).click();
		Select s = new Select(driver.findElement(By.id("exampleFormControlSelect1")));
		s.selectByIndex( 1 );
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("02/06/1996");
		driver.findElement(By.cssSelector(".btn-success")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
		System.out.println("Completed");
		System.out.println("Completed task");
		
		
	}

}
