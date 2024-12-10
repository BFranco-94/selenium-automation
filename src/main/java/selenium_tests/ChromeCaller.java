package selenium_tests;
/**
 * @author Bryan Franco Velez 
*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeCaller {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        System.out.println(driver.getTitle());
        driver.quit();

	}

}
