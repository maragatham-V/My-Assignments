package Week2.day3;

public class Chrome extends Browser
{
	
	
	public void Openincognito() 
	{
		System.out.println("Chrome class called");
	}
		
public void ClearCatch()
{
	System.out.println("catch method in chrome class called");
}

public static void main(String[] args) 
{
	Chrome ch = new Chrome();
	ch.ClearCatch();
	ch.Openincognito();
	ch.navigateBack();
	ch.openURL();
	ch.closeBrowser();	
}
	
}
