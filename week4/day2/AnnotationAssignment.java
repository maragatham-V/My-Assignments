package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AnnotationAssignment extends ProjectSpecificMethod
{

@Test
	public void create() throws InterruptedException {
	
	driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
	
	Actions action = new Actions(driver);
	Thread.sleep(3000);
	WebElement legal = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
	action.click(legal).perform();
	WebElement newTab = driver.findElement(By.xpath("//div[text()='New']"));
	action.click(newTab).perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("TestLeaf");
	driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("SalesForce");
	
	WebElement save= driver.findElement(By.xpath("//button[@id='combobox-button-207']"));
	driver.executeScript("arguments[0].click();",save);
	driver.findElement(By.xpath("//span[text()='Active']")).click();
	driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
	
	WebElement name = driver.findElement(By.xpath("//div[@class='slds-form-element__help']"));
	String text = name.getText();
	System.out.println(text);
	String actual ="Complete this field";
	
	if(actual.equalsIgnoreCase(text))
	{
		System.out.println("verified");
	}
	else
		System.out.println("Not verified");
	
	
	//driver.executeScript("arguments[0].click();",legal);
	
	
	//legal.click();
	
	
		
	}
}
