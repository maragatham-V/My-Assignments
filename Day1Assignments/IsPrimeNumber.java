package Day1Assignments;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int N=4;
		for(int i=2;i<N;i++) 
		{
			if(i%N==0)
			{
				System.out.println("The given number " + N +" is prime");
			
			}
		}
          System.out.println("The given number " + N + " is not prime");
	}

}
