package Chapter11;

import java.util.ArrayList;

class GrannySmith extends Apple{};
class Fuji extends Apple{};
public class GenericsAndUpcasting
{
	public static void main(String []arg)
	{
		ArrayList<Apple> apples=new ArrayList<Apple>();
		apples.add(new GrannySmith());
		apples.add(new Fuji());
		for(Apple c:apples)
		{
			System.out.println(c);
		}
		for(int i=0;i<apples.size();i++)
		{
			System.out.println(apples.get(i).id());
		}
		
	}
	
}