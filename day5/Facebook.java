package Assignment.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.name("firstname")).sendKeys("Maragatham");
		driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']")).sendKeys("Maragatham");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("V");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("maragathamv98@gmail.com");	
		driver.findElement(By.xpath("//input[contains(@name,'_confirmation__')]")).sendKeys("maragathamv98@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Kausalya");
		
		
		
	WebElement day= driver.findElement(By.id("day"));
	Select day1=new Select(day);
	day1.selectByIndex(19);
	
	
	WebElement month = driver.findElement(By.id("month"));
	Select month1=new Select(month);
	month1.selectByVisibleText("Mar");
	
	WebElement year = driver.findElement(By.id("year"));
	Select year1 = new Select(year);
	year1.selectByValue("1997");
	
	driver.findElement(By.name("sex")).click();

	}

}
