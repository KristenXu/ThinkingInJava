package Chapter11;
import java.util.*;

import typeinfo.pets.*;

class PetSequence
{
	protected Pet[]pets=Pets.createArray(8);
}

public class NonCollectionSequence extends PetSequence
{
	public Iterator<Pet>iterator()
	{
		return new Iterator<Pet>() 
		{
			private int index=0;
			public boolean hashNext()
			{
				return index < pets.length;
			}
			public Pet next(){return pets[index++];}
			public void remove(){
				throw new UnsupportedOperationException();
			}
			
			
		};
	}
	
	public static void main(String []arg)
	{
		NonCollectionSequence ncCollectionSequence=new NonCollectionSequence();
		InterfaceVsIterator.display(ncCollectionSequence.iterator());
	}
}