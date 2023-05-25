package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserlaunch {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("http://leaftaps.com/opentaps/control/main");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.findElement(By.id("username")).sendKeys("demosalesManager");
	
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	
	driver.findElement(By.className("decorativeSubmit")).click();
	
	driver.findElement(By.id("button")).click();
	
	driver.findElement(By.linkText("Leads")).click();
	
	driver.findElement(By.linkText("Create Lead")).click();
	
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("BNY Mellon");
	
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Madhu");
	
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Manjuri");
	
	driver.findElement(By.name("submitButton")).click();
	
	driver.findElement(By.linkText("Edit")).click();
	
	driver.findElement(By.id("updateLeadForm_companyName")).clear();
	
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("CTS");
	
	driver.findElement(By.name("submitButton")).click();
	}

}
