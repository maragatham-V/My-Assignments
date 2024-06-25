package Assignment.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountSelect {

	private static WebElement state;

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/.");
		driver.manage().window().maximize();
		WebElement usernameField = driver.findElement(By.id("username"));
		usernameField.sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
	    driver.findElement(By.linkText("Create Account")).click();
	    driver.findElement(By.id("accountName")).sendKeys("Kausi");
	    driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	    
	    
	    WebElement industry = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
	    Select industry1 =new Select(industry);
	    industry1.selectByIndex(3);
	    
	    
	    
	    WebElement ownership = driver.findElement(By.xpath("(//select[@class='inputBox'])[3]"));
	    Select owner = new Select (ownership);
	    owner.selectByVisibleText("S-Corporation");
	    
	    WebElement source = driver.findElement(By.xpath("(//select[@class='inputBox'])[4]"));
	    Select source1 = new Select (source);
	    source1.selectByValue("LEAD_EMPLOYEE");
	    
	    WebElement market = driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
	    Select market1 = new Select (market);
	    market1.selectByIndex(6);
	    
	    
	    WebElement state = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
	    Select state1 = new Select (state);
	    state1.selectByValue("TX");
	    
	    driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	    
	    driver.close();
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		

	}

}
