package yellow;

public class class2 {
	
	int a=13;
	int b=20;
	
	sample s= new sample();
	public void div()
	{
		
		System.out.println("This is division");
		System.out.println(s.na);
	}
	
	public void add(int a , int b)
	{
		System.out.println(a+b);
	}
	
	public void sub()
	{
		System.out.println(a-b);
	}
	
	public void mul()
	{
		System.out.println(a*b);
	}
	
	public void div1()
	{
		System.out.println(a/b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class2 c= new class2();
		c.add(5,6);
		c.sub();
		c.mul();
		c.div1();
		
	}

}
