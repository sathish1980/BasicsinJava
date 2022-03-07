package green;

public class interfaceimplementation implements Interface1,Interface2
{

	int c=1234567890;
	int[] a = {10,20,30,40,50};
				
	String[] s= {"sathish","kumar","R"};
	
	public void arrayconcept()
	{
		//System.out.println(c);
		//System.out.println(a[1]);
		
		int size=a.length;
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	public void maths()
	{ 
		try
		{
			System.out.println("math calculation");
		}
		catch(Exception e)
		{
			
		}
	}
	
	@Override
	public void add() {
		System.out.println("addition");
		
	}
	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("substaraction");
	}
	
	@Override
	public void mul() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void div() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interfaceimplementation i= new interfaceimplementation();
	/*	i.maths();
		Interface1 i1= new interfaceimplementation();
		i1.add();
		i1.sub();
		Interface2 i2= new interfaceimplementation();
		i2.add();*/
		i.arrayconcept();
	}

	

	
	

}
