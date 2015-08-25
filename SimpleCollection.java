package Chapter11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;



public class SimpleCollection
{
	public static void main(String []arg)
	{
		Collection<Integer>collect=new ArrayList<Integer>(); 
		for(int i=0;i<10;i++)
		{
			collect.add(i);
			collect.add(i);
			
		}
		for(Integer i:collect)
		{
			
			System.out.println(i);
		}
		
		
	}
	
}