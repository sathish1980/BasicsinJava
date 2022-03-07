package green;

public class Basicinformation
{

	public String name="sathish kumar";
	public void age(int year)
	{
		int currentyear=2021;
		int actualage=currentyear-year;
		System.out.println("Your actual age is : " +actualage);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Basicinformation b= new Basicinformation();
		b.age(1990);

	}

}
