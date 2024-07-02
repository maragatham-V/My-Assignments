package Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PvrCinemas {


	public static void main(String[] args) throws InterruptedException {
		ChromeDriver dr = new ChromeDriver();
		dr.get("https://www.pvrcinemas.com/");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		dr.findElement(By.xpath("//span[text()='Chennai']")).click();
		dr.findElement(By.xpath("//span[text()='Cinema']")).click();
		dr.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		dr.findElement(By.xpath("//span[text()='INOX National,Virugambakkam Chennai']")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("(//li[@class='p-dropdown-item']/span)[2]")).click();
		
		
        WebElement movie = dr.findElement(By.xpath("//span[contains(text(),'KALKI ')]"));
        dr.executeScript("arguments[0].click();",movie);
 
        dr.findElement(By.xpath("//div[@class='dates-inactive']")).click();
        WebElement time = dr.findElement(By.xpath("//div[@class='time-select']"));
        dr.executeScript("arguments[0].click();", time);
  
        dr.findElement(By.xpath("//button[@class='sc-jlZhRR ewzZVH reject-terms']")).click(); 
        dr.findElement(By.xpath("//span[@id='CL.CLUB|I:16']")).click();
        //dr.findElement(By.xpath("//button[text()='Confirm Seat']")).click();	
        dr.findElement(By.xpath("//button[text()='Proceed']")).click();  
        
        
        String summary = dr.findElement(By.xpath("//div[@class='movies-summary']")).getText();
        System.out.println(summary);
                            
        
        Thread.sleep(2000);  
        String total = dr.findElement(By.xpath("//div[@class='grand-tota col-md-3']")).getText();
       System.out.println(total);
       dr.findElement(By.xpath("//button[text()='Proceed']")).click();
       Thread.sleep(2000);
       dr.findElement(By.xpath("(//input[@id='mobileInput'])[2]")).sendKeys("6379582805");
       
       Thread.sleep(2000);
       WebElement proceed = dr.findElement(By.xpath("//button[text()='Proceed']")); 
       dr.executeScript("arguments[0].click();", proceed);
       
       WebElement close = dr.findElement(By.xpath("//i[@class='pi pi-times']"));
       dr.executeScript("arguments[0].click();",close);
       
       String title = dr.getTitle();
       System.out.println(title);
       dr.close();
       
       
        
  
	}

}
