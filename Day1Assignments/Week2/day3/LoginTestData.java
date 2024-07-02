package Week2.day3;

public class LoginTestData extends TestData
{
	void enterUserName() 
	{
		System.out.println("Maragatham");
	}
	void enterPassword() 
	{
		System.out.println("Pass");
	}

	public static void main(String[] args) {
		LoginTestData login = new LoginTestData();
		TestData Test = new TestData();
		Test.enterCredentials();
		login.enterUserName();
		login.enterPassword();
		Test.navigateToHomePage();
		
		
	}

}
