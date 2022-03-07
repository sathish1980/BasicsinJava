package green;
import yellow.*;

public class greeenclass extends sample {
	//sample s= new sample();
	
	public void method1(int a, int b, int c)
	{
		int d=a+b+c;
	System.out.println("This is sample: "+d );
	System.out.println("This is sample: " + na);
	}
	
	public void method2()
	{
		int a=10;
		int b=20;
		int c=30;
		
		double e=sub();
		double d=a+b+c+e;
		System.out.println("This final output is: "+d );
	}
	
	
	public double sub()
	{
		int a=10;
		double b=20.3;
		double c=30.4;
		double d=c-b;
		 return d;
		
	}
	
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		greeenclass g= new greeenclass();
		g.method2();
		System.out.println("This is sample");
		System.out.print("This is sample");
		System.out.print("This is sample");

	}

}