package green;

public class calculator {
	
	public void add(int a, int b)
	{
		
		int c=a+b;
		System.out.println(c);
	}

	public void add(double a, int b)
	{
		
		double c=a+b;
		System.out.println(c);
	}
	
	public void add(int a, int b,int d)
	{
		
		int c=a+b+d;
		System.out.println("This is 3 parameter: "+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator c= new calculator();
		c.add(2, 4);
		c.add(1.2, 5);
		c.add(1, 2,3);
	}

}
