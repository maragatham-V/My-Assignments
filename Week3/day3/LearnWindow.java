package Week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.irctc.co.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("FLIGHTS")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> window = new ArrayList<String>(windowHandles);
		Thread.sleep(2000);
		driver.switchTo().window(window.get(1));
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.switchTo().window(window.get(0));
		driver.close();
		
	}

}
