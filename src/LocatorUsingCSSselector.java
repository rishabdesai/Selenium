
/* This code will open the login.salesforce.com page using .get() method. 
 * Use findElement and cssSelector to locate username and password field, enter some dummy data
 * use xpath to find the login button, then click it.
 * css format "tagname[attribute='value']"
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorUsingCSSselector {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\d_ris\\OneDrive\\903_testing\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// open salesforce page, select user email & password, enter dummy value in it.
		driver.get("http://login.salesforce.com");

		// css format "tagname[attribute='value']" or "[attribute='value']" 
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("dummy@email.com");
		driver.findElement(By.cssSelector("input[name='pw']")).sendKeys("123456");
		driver.findElement(By.cssSelector("input[name='Login']")).click();
		// if login fails, then print the error message on console using getText()
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());

		// another cssSelector format "tagname#id" and "#id" and "tagname.classname"
//		driver.findElement(By.cssSelector("#username")).sendKeys("dummy@email.com");
//		driver.findElement(By.cssSelector("#password")).sendKeys("123456");
//		driver.findElement(By.cssSelector("#Login")).click();
		// if login fails, then print the error message on console using getText()
//		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());


	}

}
