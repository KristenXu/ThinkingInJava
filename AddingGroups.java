package Chapter11;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.swing.Box.Filler;

public class AddingGroups
{
	public static void main(String []arg)
	{
		Collection<Integer>collection=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		Collection<Integer>collection1=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		Integer []moreInts={6,7,8,9,10};
		collection.addAll(Arrays.asList(moreInts));
		//只能以一个对象为参数
		collection.addAll(collection1);
		//可以一个对象、或者对象+常数
		Collections.addAll(collection1,moreInts);
		
		List<Integer>list=Arrays.asList(16,17,18,19,20);
		list.set(1,99);
		//list.add(21);
		
		System.out.println(list);
		System.out.println(collection);
		System.out.println(collection1);
	}
}



