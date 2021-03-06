package Chapter11;
import java.util.*;

import typeinfo.pets.*;

public class CollectionSequence extends AbstractCollection<Pet>
{
	private Pet []pets=Pets.createArray(8);
	public int size(){return pets.length;}
	public Iterator< Pet>iterator()
	{
		return new Iterator<Pet>() {
			private int index=0;
			public boolean hasNext()
			{
				return index<pets.length;
			}
			public Pet next(){return pets[index++];};
			public void remove(){throw new UnsupportedOperationException();}
			
		};
	}
	public static void main(String []arg)
	{
		CollectionSequence c=new CollectionSequence();
		InterfaceVsIterator.display(c);
		InterfaceVsIterator.display(c.iterator());
		
	}
}