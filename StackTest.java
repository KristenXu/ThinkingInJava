package Chapter11;
public class StackTest
{
	public static void main(String []arg)
	{
		Stack<String>stack=new Stack<String>();
		for(String s:"1 2 3".split(" "))
		stack.push(s);
		while(!stack.empty())
			System.out.print(stack.pop()+" ");
	}
}