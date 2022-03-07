package green;

public class Multilevelinheritance extends singleinheritance {

	public void mul(int a, int b)
	{
		int c= a*b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multilevelinheritance m = new Multilevelinheritance();
		m.mul(10, 2);
		m.add(2, 10);
		m.sub(40);
	}

}
