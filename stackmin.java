// program to store corresponding min element for each element in stack in Java

import java.util.*;
 
class mini {
	public int value;
	public int min;
	public  mini(int v,int m)
	{
		value = v;
		min = m;
	}
}

public class stackmin extends Stack<mini> {

	public void push(int v)
	{
	 int newMin = Math.min(v,min());
	 super.push(new mini(v,newMin));
	}

	public int min()
	{
	  if(this.isEmpty())
		return Integer.MAX_VALUE;
	  else
		return peek().min;
	}

	
public static void main(String args[])
		{
			stackmin s = new stackmin();
			s.push(4);
			s.push(2);
			System.out.println(s.min());
		}
}

