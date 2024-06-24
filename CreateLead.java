package Day3Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement usernameField = driver.findElement(By.id("username"));
		usernameField.sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("IBM");	
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Maragatham");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("V");
        driver.findElement(By.name("generalProfTitle")).sendKeys("Create Lead");
        
        String Title= driver.getTitle();
        System.out.println(Title);
        
        driver.close();
        
        
		

	}

}
