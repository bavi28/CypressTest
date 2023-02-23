package New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Homepage {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bavit\\eclipse-workspace\\Task\\chromedriver.exe");
	 	WebDriver driver=new ChromeDriver();
	 	driver.get("http://localhost:3000/signin");
	 	driver.manage().window().maximize();
		WebElement uname = driver.findElement(By.id("username"));
		uname.sendKeys("test");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("s3cret");
		WebElement signin = driver.findElement(By.xpath("//span[text()='Sign In']"));
		signin.click();
		Thread.sleep(3000);
		driver.findElement(By.className("MuiDialog-root"));
		driver.switchTo().activeElement();
		WebElement next=driver.findElement(By.xpath("//span[text()='Next']"));
		next.click();
		WebElement bankname=driver.findElement(By.xpath("//input[@name='bankName']"));
		bankname.sendKeys("12345");
		WebElement routingno=driver.findElement(By.xpath("//input[@name='routingNumber']"));
		routingno.sendKeys("123456767");
		WebElement accno=driver.findElement(By.xpath("//input[@name='accountNumber']"));
		accno.sendKeys("123456869");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.switchTo().activeElement();
		driver.findElement(By.xpath("//span[text()='Done']")).click();
		Thread.sleep(3000);
		WebElement everyone=driver.findElement(By.xpath("//span[text()='Everyone']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(everyone).build().perform();
		
		
	}

}
