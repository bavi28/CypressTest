package New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bavit\\eclipse-workspace\\Task\\chromedriver.exe");
	 	WebDriver driver=new ChromeDriver();
	 	driver.get("http://localhost:3000/signin");
	 	driver.manage().window().maximize();
	 	WebElement fname = driver.findElement(By.id("firstName"));
		fname.sendKeys("Bavithra");
		WebElement lname = driver.findElement(By.id("lastName"));
		lname.sendKeys("Rangarajulu");
		WebElement uname = driver.findElement(By.id("username"));
		uname.sendKeys("test");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("s3cret");
		WebElement cpwd = driver.findElement(By.id("confirmPassword"));
		cpwd.sendKeys("s3cret");
		WebElement signup = driver.findElement(By.xpath("//span[text()='Sign Up']"));
		signup.click();

}
}
