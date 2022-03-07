package green;

public class methodoverriding extends calculator
{
	
	public void add(int a, int b)
	{
		
		int c=a-b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodoverriding m = new methodoverriding();
		m.add(2, 5);
		//calculator c = new calculator();
		//c.add(2, 5);
	}

}
