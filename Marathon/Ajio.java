package Marathon;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30) );
		WebElement search = driver.findElement(By.name("searchVal"));
		search.sendKeys("Bags");
		search.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
        Thread.sleep(2000);
        
         driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		 String text = driver.findElement(By.className("length")).getText();
		 System.out.println(text);
		 
		 List<WebElement> brandlist =driver.findElements(By.xpath("//div[@class='brand']"));
		 System.out.println("List of brand name ");
	     for(WebElement list : brandlist )
		 {
			 System.out.println( list.getText());
		 }
	     
	     System.out.println("List of bag name");
	      List<WebElement> name = driver.findElements(By.xpath("//div[@class='nameCls']"));
	      
	      for( WebElement bagName : name)

	      {
	    	  System.out.println(bagName.getText());
	      }
	}

}
