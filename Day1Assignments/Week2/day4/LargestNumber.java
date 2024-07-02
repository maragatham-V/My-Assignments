package Week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {3,2,11,4,6,7};
		List<Integer> ls = new ArrayList<Integer>();
		
		for (int a: arr)
		{
			ls.add(a);
		}
		Collections.sort(ls);
		System.out.println(ls);
		System.out.println(ls.get(ls.size()-2));
		

	}

}
