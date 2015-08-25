package Chapter11;

import java.util.*;

public class PrintContainers
{
	static Collection fill(Collection<String>collection)
	{
		collection.add("rat");
		collection.add("cat");
		collection.add("dog");
		collection.add("dog");
		return collection;
	}
	
	static Map fill(Map<String, String>map)
	{
		map.put("1", "rat");
		map.put("3", "cat");
		map.put("2", "dog");
		map.put("4", "dog");
		return map;
	}
	public static void main(String []arg)
	{
		//按插入顺序，可以重复
		System.out.println(fill(new ArrayList<String>()));
		//按插入顺序，可以重复
		System.out.println(fill(new LinkedList<String>()));
		//不按顺序，不可重复
		System.out.println(fill(new HashSet<String>()));
		//不按顺序，不可重复，不可用get()方法
		System.out.println(fill(new TreeSet<String>()));
		//按顺序，不可重复
		System.out.println(fill(new LinkedHashSet<String>()));
		//无顺序，查询速度快；一个key只能有一个value;value值可以重复；
		System.out.println(fill(new HashMap<String,String>()));
		//按key的升降来排列
		System.out.println(fill(new TreeMap<String,String>()));
		//按插入顺序
		System.out.println(fill(new LinkedHashMap<String,String>()));
	}
}