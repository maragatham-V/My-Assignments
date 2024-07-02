package Week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4,10,6,8};
		List<Integer> ls =new ArrayList<Integer>();
		List<Integer> ls1 = new ArrayList<Integer>();
		
		for( int a:arr)
		{
			ls.add(a);
		}
		Collections.sort(ls);
		
		int last=ls.get(ls.size()-1);
		
		for(int i = 0;i<=last-1;i++)
		{
			ls1.add(i+1);
			if(i==last)
			{
				break;
			}
		}
		ls1.removeAll(ls);
		System.out.println(ls1);
		
		
	}
		
		
		
		
		
		
	}


