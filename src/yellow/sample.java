package yellow;

public class sample {
	
	//four types of method
	//1.Method with out parameter
	//2.Method with parameter
	//3.Method with out return type
	//4.Method with  return type
	
	//syntax : accessmodifier returntype methodname() {}
	//syntax for variable : accesmodifier datatype varablename = variable value;
	
	//global variable
	 public String na="kumar";
	 int i=45;
	public double f=23.434;
	//datatypes
	/*int -whole number (e.g int a= 10)
	float - one digit decimal (e.g float b= 10.2f)
	double - more than one digit decimal' (e.g double c= 10.22323)
	char - character  (e.g char d= 's')
	String - whole word (e.g String e= "sathish")
	Boolean -true/false (e.g Boolean f= true)
	long- 10 digit value(depreciated)*/
	
	/*public sample(int a, int b)
	{

		System.out.println("This is construcotr");
	}*/
	public void method1()
	{
		String na="sathish kumar";
		char ss= 'a';
		System.out.println(na);	
		System.out.println("Sathish kumar");	
		System.out.println("Sathish kumar");
		System.out.println("Sathish kumar");
	}

	//Method with out parameter
	public void add()
	{
		int i=40;
		int j=20;
		int z;
		
		z=i+j;
		
		System.out.println(z);
		System.out.println("addition of 2 numbers: "+z);
		System.out.println(na);
				
				
	}
	
	//Method with parameter
		public void addition(int i, int j)
		{
		
			int z;
			int s=sub(i, j);
			z=i+j+s;
			//int Z=i+j+sub(i, j);
			
			System.out.println("addition of 2 numbers: "+z);
								
		}
		
		
		//Method with returntype
		public int sub(int i, int j)
				{
				
					int z;
					
					z=i-j;
					
					System.out.println("addition of 2 numbers: "+z);
					
					return z;
										
				}
				
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		sample s = new sample();//instatisation
		s.method1();
		s.method1();
		//s.add();
		s.addition(20,7);
		//s.addition(5,5);
	}

}
