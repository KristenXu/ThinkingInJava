package Chapter11;
import java.util.*;



import typeinfo.pets.*;
public class InterfaceVsIterator
{
	public static void display(Iterator<Pet>it)
	{
		while(it.hasNext())
		{
			Pet p=it.next();
			System.out.print(p.id()+":"+p+" ");
			
		}
		System.out.println();
	}
	public static void display(Collection<Pet>pets)
	{
		for(Pet p:pets)
			System.out.print(p.id()+":"+p+" ");
		System.out.println();
	}
	public static void main(String []args)
	{
		List<Pet>petList=Pets.arrayList(8);
		Set<Pet>petSet=new HashSet<Pet>(petList);
		Map<String, Pet>petMap=new HashMap<String, Pet>();
		String []names=("Ral, Eric, Robin, Lacey, "+"Brintey, Sam, Spot, Flutty").split(", ");
		for(int i=0;i<names.length;i++)
			petMap.put(names[i], petList.get(i));
		display(petList);
		display(petSet);
		display(petList.iterator());
		display(petSet.iterator());
		System.out.println(petMap);
		System.out.println(petMap.keySet());
		display(petMap.values());
		display(petMap.values().iterator());
	}
}