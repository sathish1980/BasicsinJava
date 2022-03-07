package green;

public class singleinheritance extends Inheritance {
	
	public void sub(int b) 
	{
	
		int c= b-a;
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		singleinheritance s= new singleinheritance();
		s.sub(5);
		s.add(3, 5);
		
		
	}

}
