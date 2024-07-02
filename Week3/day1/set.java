package Week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String companyName="google";
		char[]  ar = companyName.toCharArray();
		Set<Character> c = new LinkedHashSet<Character>();
		for(char ch : ar)
		{
		c.add(ch);	
		System.out.println(c);
		}
		System.out.println("Print the string "+ c);
		

	}

}
