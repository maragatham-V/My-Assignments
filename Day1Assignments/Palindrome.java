package Day1Assignments;

public class Palindrome {
	public static void main(String[] args)
	{
		int num=121;
		int rev=0;
		int orgNum=num;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		//System.out.println(rev);
		//System.out.println(num);
		if(orgNum==rev)
		{
		System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
		
		
	}

}
