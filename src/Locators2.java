import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String name ="asmita";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asmit\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// wait 5 sec on each and every line bcz it is global
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// implicit wait
		String pass=getPassword(driver);//not want to cerate object bcz method is static
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(pass);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
//		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello " +name+",");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();
	}

	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText=driver.findElement(By.cssSelector("form p")).getText();//  parent to child
		
//		Please use temporary password 'rahulshettyacademy' to Login.
		String[] passArray=passwordText.split("'");
		//after split -----0 index --- Please use temporary password '
//		1 index----.rahulshettyacademy' to Login.
//		String[] passArray2=passArray[1].split("'");
		//after split -----0 index ---  rahulshettyacademy
//		1 index----.' to Login.
//		passArray2[0];
		
		String password =passArray[1].split("'")[0];
		return password;
		
		
		
	}
}
