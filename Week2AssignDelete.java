package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week2AssignDelete {

	public static void main(String[] args) {
ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesManager");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8012787044");
		
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		
		try {
			Thread.sleep(3000);
		
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		String Leadid = driver.findElement(By.xpath("(//div[@class='x-panel x-grid-panel']//table)[2]//a")).getText();
		
		System.out.println("Leadid"+Leadid);
		
		driver.findElement(By.xpath("(//div[@class='x-panel x-grid-panel']//table)[2]//a")).click();
		
		driver.findElement(By.xpath("//a[(text()='Delete')]")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(Leadid);
		
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		
		Boolean message = driver.findElement(By.xpath("//div[text()='No records to display']")).isDisplayed();
		
		System.out.println("Message for successful deletion"+message);
		
		driver.close();
		
	}

}
