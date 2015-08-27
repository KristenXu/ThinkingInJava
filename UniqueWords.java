package Chapter11;
import java.util.*;
import net.mindview.util.*;

import java.awt.TextField;

public class UniqueWords 
{
	public static void main(String []args)
	{
		Set<String>words=new TreeSet<String>(new TextFile("SetOperations.java","\\W+"));
		System.out.print(words);
	}
}