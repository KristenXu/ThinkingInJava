package Chapter11;
import java.util.*;

class ReversibleArrayList<T>extends ArrayList<T>
{
	 public ReversibleArrayList<T>(Collection<T>c){super(c)};
	 public Iterable<T>reversed()
	 {
		 return new Iterable<T>() 
		{
			 int current=size()-1;
			 public boolean hasNext(){return current>-1;};
			 public T next(){return get(current--);}
			 public void remove()
			 {
				 throw new UnsupportedOperationException();
			 }
			 
			 
		};
	 }
}

public class AdapterMethodIdiom
{
	public static void main(String []arg)
	{
		ReversibleArrayList<String>ral=new ReversibleArrayList<String>
		(Arrays.asList("To be or not to be ".split( " ")));
	}
}