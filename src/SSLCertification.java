

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SSLCertification {

	public static void main(String[] args) {

		//setting chromedriver behavior
		ChromeOptions option = new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		
		//handle proxy
		Proxy proxy= new Proxy();
		proxy.setHttpProxy("ipaddress:4444");

		option.setCapability("proxy", proxy);

		Map<String, Object> prefs = new HashMap<String, Object>();



		prefs.put("download.default_directory", "/directory/path");
		option.setExperimentalOption("prefs", prefs);
		//for firefox
//		FirefoxOptions option1 =new FirefoxOptions();
//		option1.setAcceptInsecureCerts(true);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asmit\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(option);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());

	}

}
