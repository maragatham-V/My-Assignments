package Week2.day4;

import java.util.List;
import java.util.ArrayList;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,2,11,4,6,7};
		int b[]= {1,2,8,4,9,7};
	    List<Integer> ls = new ArrayList<Integer>();
	    List<Integer> ls1 = new ArrayList<Integer>();
	    
	    for(int arr:a)
	    {
	    ls.add(arr);
	    }
	    
	    for(int arr1:b)
	    {
	    ls1.add(arr1);
	    }
	    
	    for(int i=0;i<ls.size();i++)
	    {
	    	for(int j=0;j<ls1.size();j++)
	    	{
	    		if(ls.get(i).equals(ls1.get(j)))
	    		{
	    			System.out.println(ls.get(i));
	    		}
	    		
	    	}
	    }
	    

	}

}
