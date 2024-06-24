package Day3Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver fb =new ChromeDriver();
		fb.get("https://www.facebook.com/");
		fb.manage().window().maximize();
	    fb.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		fb.findElement(By.id("pass")).sendKeys("Tuna@321");
		fb.findElement(By.name("login")).click();
		fb.findElement(By.partialLinkText("Find your account and log in.")).click();
		String title=fb.getTitle();
		
		
		//Thread.sleep(3000);
		//fb.close();
				
	}

}
