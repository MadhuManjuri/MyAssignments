package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {
		// 1	Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// 2	Enter the username
		driver.findElement(By.xpath("(//form[@id='login']//input)[1]")).sendKeys("demosalesManager");
		// 3	Enter the password
		driver.findElement(By.xpath("//label[text()='Password']/following-sibling::input")).sendKeys("crmsfa");
		// 4	Click Login
		driver.findElement(By.xpath("//input[@id='password']/following::input")).click();
		// 5	Click crm/sfa link
		driver.findElement(By.xpath("//div[@id='label']/a")).click();
		// 6	Click Leads link
		driver.findElement(By.xpath("//div[@class='x-panel-header']/a[text()='Leads']")).click();
		// 7	Click on Create Lead
		driver.findElement(By.xpath("//a[text()='Find Leads']/preceding::a[text()='Create Lead']")).click();
        // 8 Enter company name
		driver.findElement(By.xpath("//span[text()='Parent Account']/preceding::input[@class='inputBox']")).sendKeys("CTS");
        // 9 Enter first name
		driver.findElement(By.xpath("//span[text()='Last name']/preceding::input[@id='createLeadForm_firstName']")).sendKeys("Madhu");
        // 10 Enter last name
		driver.findElement(By.xpath("//span[text()='Last name']/following::input[@id='createLeadForm_lastName']")).sendKeys("Manjuri");
        // 11 click on Create Lead button  
		driver.findElement(By.xpath("//input[@class='smallSubmit']/parent::td")).click();
		// 12 Click Edit
		driver.findElement(By.xpath("//a[text()='Qualify Lead']/following-sibling::a[text()='Edit']")).click();
		
		driver.findElement(By.xpath("//span[text()='Parent Account']/preceding::input[@class='inputBox']")).clear();
		// 13 Change the company name
		driver.findElement(By.xpath("//span[text()='Company Name']/following::input[@class='inputBox']")).sendKeys("TCS");
		// 14 Click Update
		driver.findElement(By.xpath("(//input[@class='smallSubmit']/parent::td)[1]")).click();
	}

}
