package green;

import java.io.IOException;

public final class Samplc 
{

	public final int a=10;
	public final void forloop() throws ArithmeticException,IOException
	{
	
		try
		{
		for(int i=1;i<10;i++)
		{
			System.out.print(i);
			//i=i/0;
			throw new ArithmeticException("invlaid vaue");
		}
		System.out.println("");
		}
		catch(Exception d)
		{
			System.out.println(d);
		}
		finally
		{
		System.out.println("finally");
		}
	}
	
	public void whileloop()
	{
		try
		{
		int i=5;
		while(i<20)
		{
			System.out.print(i);
			i=i+2;
		}
		System.out.println("");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	public void dowhileloop()
	{
		int i=5;
		do
		{
			System.out.print(i);
			i=i+2;
		}
		while(i<20);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samplc s= new Samplc();
		//s.forloop();
		s.whileloop();
		s.dowhileloop();
	}

}
