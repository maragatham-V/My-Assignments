package Week2.day3;

public class APIClient {
	

	public void sendRequest(String endPoint)
	{
		System.out.println(endPoint);
	}
	
	public void sendRequest (String endPoint,String requestBody,Boolean requeststatus)
	{
		System.out.println(endPoint);
		System.out.println(requestBody);
		System.out.println(requeststatus);
	}
	public static void main(String[] args)
	
	{
		APIClient client = new APIClient();
		client.sendRequest("Hello");
		client.sendRequest("Hai", "TestLeaf", true);
		

	}

}
