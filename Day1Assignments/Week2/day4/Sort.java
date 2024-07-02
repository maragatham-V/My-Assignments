package Week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"HCL","WIPRO","Aspire Systems","CTS"};
		
		List<String> ls = new ArrayList<String>();
		
		for(String s : arr)
		{
			ls.add(s);
		}
		System.out.println(ls);
		Collections.sort(ls);
		System.out.println(ls);
		Collections.reverse(ls);
		System.out.println(ls);
		
		
		

	}

}
