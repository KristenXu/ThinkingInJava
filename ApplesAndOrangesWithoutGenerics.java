package Chapter11;

import java.util.ArrayList;

class Apple
{
	private static long counter;
	private final long id=counter++;
	public long id(){return id;}
}
class Orange{};
public class ApplesAndOrangesWithoutGenerics
{
	@SuppressWarnings("unchecked")
	public static void main(String []arg)
	{
		ArrayList<Apple> apples=new ArrayList<Apple>();
		for(int i=0;i<3;i++)
		apples.add(new Apple());
		
			for(int i=0;i<apples.size();i++)
			{
				System.out.println(apples.get(i).id());
			}
			for(Apple c:apples)
			{
				System.out.println(c.id());
			}
			
			String s1="a"; 
			String s2=s1+"b";
			System.out.println(s2=="ab");
			
		
	}
}