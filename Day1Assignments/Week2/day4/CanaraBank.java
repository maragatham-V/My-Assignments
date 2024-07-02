package Week2.day4;

public abstract class CanaraBank implements Payment
{
	public void recordPaymentDetails()
	{
		System.out.println("Your payment details");
	}
	
	public void upiPayments() 
	{
		System.out.println("UPI Payment");
	}
}
