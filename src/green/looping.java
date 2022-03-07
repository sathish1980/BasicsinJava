package green;

import java.io.IOException;

public class looping {

	private void forloop(int cond) throws ArithmeticException,IOException
	{
		try
		{
		
		
		for(int i=0;i<10;i++)
		{
			i=i/0;
			System.out.print(i);
			throw new ArithmeticException("it is not a divisble number");
			//System.out.println("");
		}
		System.out.println("");
		for(int i=0;i<cond;i++)
		{
			//i=i/1;
			System.out.print(i);
		}
		System.out.println("out of finally");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("inside of finally");
		}
		
	}
	
	public void whileloop(int condition)
	{
		try
		{
		while(condition<10)
		{
			System.out.println(condition);
			condition=condition+1;
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	public void dowhileloop(int condition)
	{
		do
		{
			System.out.println(condition);
			condition=condition++;
		}
		while(condition<10);
		
	}
	public static void main(String[] args) throws ArithmeticException, IOException {
		// TODO Auto-generated method stub
		looping l= new looping();
		l.forloop(5);
		l.whileloop(9);
		l.dowhileloop(11);
	}

}
