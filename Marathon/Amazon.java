package Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
		
		public static void main(String[] args) throws InterruptedException {
			ChromeDriver dr = new ChromeDriver();
			dr.get("https://www.amazon.in/");
			dr.manage().window().maximize();
			dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
			dr.findElement(By.id("twotabsearchtextbox")).sendKeys("bags for b");
			dr.findElement(By.xpath("//div[text()='bags for b']")).click();
			String text = dr.findElement(By.xpath("//div[@class='sg-col-inner']")).getText();
	        System.out.println(text);
	        dr.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
	        dr.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[5]")).click();
	       dr.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
	        dr.findElement(By.xpath("//*[text()='Newest Arrivals']")).click();
	       String details = dr.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']")).getText();
	        
		  System.out.println(details);
		  dr.close();
		
		}
		

}
