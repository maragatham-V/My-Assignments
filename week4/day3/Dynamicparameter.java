package week4.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dynamicparameter extends Base {
	
	@Test(dataProvider="FetchData")
	public void create(String name,String cName,String Description) throws InterruptedException {
	
	driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
	
	Actions action = new Actions(driver);
	Thread.sleep(3000);
	WebElement legal = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
	action.click(legal).perform();
	WebElement newTab = driver.findElement(By.xpath("//div[text()='New']"));
	action.click(newTab).perform();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys(name);
	driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys(cName);
	driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys(Description);
	
	WebElement save= driver.findElement(By.xpath("//button[@id='combobox-button-207']"));
	driver.executeScript("arguments[0].click();",save);
	driver.findElement(By.xpath("//span[text()='Active']")).click();
	driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
	

}

@DataProvider(name="FetchData")
	public String[][] sendData()
	{
		String [][] data= new String[1][3];
		data[0][0] = "Maragatham";
		data[0][1]="TestLeaf";
		data[0][2]="salesforce";
		
		

		return data;
		
		
	}
}