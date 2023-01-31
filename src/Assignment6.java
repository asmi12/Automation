import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asmit\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		String selectedCheckbxText= driver.findElement(By.xpath("//label[@for='bmw']")).getText();
		System.out.println(selectedCheckbxText);
		WebElement enterText=  driver.findElement(By.cssSelector("#dropdown-class-example"));
		Select s = new Select(enterText);
		s.selectByVisibleText(selectedCheckbxText);
		
		driver.findElement(By.id("name")).sendKeys(selectedCheckbxText);
		driver.findElement(By.id("alertbtn")).click();
		 String alertText=driver.switchTo().alert().getText();
		 if(alertText.contains(selectedCheckbxText))
		 {
			 System.out.println("text is present");
		 }
		 else
		 {
			 System.out.println("Not present");
		 }
	}

}
