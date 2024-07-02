package Week2.day4;

public class Amazon extends CanaraBank
{
	public void cashOnDelivery()
	{
		// TODO Auto-generated method stub
		System.out.println("Cash on delivery payment");
}

public void cardPayments()
{
		// TODO Auto-generated method stub
		System.out.println("Card payment");
		}
public void internetBanking() {
		// TODO Auto-generated method stub
		System.out.println("Banking");
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Amazon am = new Amazon();
		am.cardPayments();
		am.cashOnDelivery();
		am.internetBanking();
		am.recordPaymentDetails();
		am.upiPayments();
}
}
