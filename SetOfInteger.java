package Chapter11;

import java.util.Random;
import java.util.*;
public class SetOfInteger
{
	public static void main(String []arg)
	{
		Random random=new Random(0);
		Set<Integer>set=new TreeSet<Integer>();
		for(int i=0;i<100;i++)
		{
			set.add(random.nextInt(30));
		}
		System.out.println(set);
	}
}