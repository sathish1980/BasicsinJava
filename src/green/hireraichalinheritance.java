package green;

public class hireraichalinheritance extends Inheritance{

	public void div(int a, int b)
	{
		int c= a/b;
		System.out.println(c);
	}
	
	//Method overriding
	public void add(int a, int b)
	{
		int c= a-b;
		System.out.println(c);
		
	}
	//method oveloading
	public void div(int a, double b)
	{
		double c= a/b;
		System.out.println(c);
	}
	
	public void div(int a, int b,int d)
	{
		int c= a+d/b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hireraichalinheritance h= new hireraichalinheritance();
		h.div(10, 2);
		h.div(10, 2,3);
		h.div(10, 2.1);
		h.add(10, 20);
		Inheritance i= new Inheritance();
		i.add(1, 2);
	}

}
