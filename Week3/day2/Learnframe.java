package Week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learnframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert = driver.switchTo().alert();
	    System.out.println(alert.getText());	
		alert.dismiss();
		String text = driver.findElement(By.id("demo")).getText();
		System.out.println(text);
		String actual ="You pressed cancel!";
		if(actual.equalsIgnoreCase(text))
		{
			System.out.println("verified");
		}
		else
			System.out.println("not verified");
		}
		
		
		//driver.switchTo().frame(0);
		
		//driver.findElement(By.xpath("//button[@id='click']")).click();
		
	}


