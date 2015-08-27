package Chapter11;
import java.util.*;
public class SetOperations
{
	public static void main(String []arg)
	{
		Set<String>set1=new HashSet<String>();
		Collection<String>set2=new HashSet<String>();
		Collections.addAll(set1,("1 2 3 4 5 6").split(" "));
		Collections.addAll(set2,("7 8 9 10").split(" "));
		System.out.println(set1);
		System.out.println(set1.containsAll(set2));
		set1.remove("1");
		System.out.println(set1);
		
	}
}