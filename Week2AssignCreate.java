package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Week2AssignCreate {

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
		
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("BNY Mellon");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Madhu");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Manjuri");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("test@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("12345");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();

		
	}	
}