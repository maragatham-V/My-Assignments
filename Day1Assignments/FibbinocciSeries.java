package Day1Assignments;

public class FibbinocciSeries {
	public static void main(String[] args) {
		int num1=0,num2=1;
		int range=8;
		for(int i=1;i<=range;i++) {
			System.out.println(num1);
			
			int sum=num1+num2;
			
			
			num1=num2;
			num2=sum;
			
			
		}
		
	}

}
