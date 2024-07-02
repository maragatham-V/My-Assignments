package Week2.day4;

public class JavaConnection extends MySqlConnection
{
	
	public void connect() 
	{
     System.out.println("called connect method");
	}
	public void disconnect()
	{
		System.out.println("called disconnect method");
	}
	public void executeUpdate()
	{
		System.out.println("Called executeupdate method");
	}

	public static void main(String[] args)
	{
		JavaConnection jc = new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
		jc.executequery();
	}

	

}
