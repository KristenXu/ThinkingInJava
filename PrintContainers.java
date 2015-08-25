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
		//������˳�򣬿����ظ�
		System.out.println(fill(new ArrayList<String>()));
		//������˳�򣬿����ظ�
		System.out.println(fill(new LinkedList<String>()));
		//����˳�򣬲����ظ�
		System.out.println(fill(new HashSet<String>()));
		//����˳�򣬲����ظ���������get()����
		System.out.println(fill(new TreeSet<String>()));
		//��˳�򣬲����ظ�
		System.out.println(fill(new LinkedHashSet<String>()));
		//��˳�򣬲�ѯ�ٶȿ죻һ��keyֻ����һ��value;valueֵ�����ظ���
		System.out.println(fill(new HashMap<String,String>()));
		//��key������������
		System.out.println(fill(new TreeMap<String,String>()));
		//������˳��
		System.out.println(fill(new LinkedHashMap<String,String>()));
	}
}