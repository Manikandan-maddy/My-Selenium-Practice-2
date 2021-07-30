package newproject;

import java.util.Arrays;

public class Newprojectexample {

	
int name[]= {2,1,6,4,5};
	
	
	public void smallestvalue()
	{
		
		int smallest=Integer.MAX_VALUE;
		
		for(int i=0;i<name.length;i++)
		{
			if(name[i]<smallest);{
          smallest=name[i];
		}
		
	}
	}
	//System.out.println(smallest);
	

public void usingArraysort()
{
	Arrays.sort(name);
	System.out.println(name[0]);
}
}





	
	
	
	
}
