import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asmit\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		
		//print count
		driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	}

}
