package week3.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;

public class Facebook {
	public static void main(String[] args)
	{
ChromeDriver driver = new ChromeDriver();
	
driver.get("https://en-gb.facebook.com/");

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();

driver.findElement(By.xpath("//div[@class='_5dbb']/input")).sendKeys("Testname");

driver.findElement(By.xpath("//div[text()='Surname']/following-sibling::input")).sendKeys("Lastname");

driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys("899982891");

driver.findElement(By.xpath("//div[text()='New password']/following-sibling::input")).sendKeys("Lastname");

driver.findElement(By.xpath("//div[text()='New password']/following-sibling::input")).sendKeys("Lastname");

driver.findElement(By.xpath("//select[@id='day']/option[text()=21]")).click();

driver.findElement(By.xpath("//select[@id='month']/option[text()='Mar']")).click();

driver.findElement(By.xpath("//select[@id='year']/option[text()='1993']")).click();

driver.findElement(By.xpath("//label[text()='Female']/parent::span")).click();
}
}
