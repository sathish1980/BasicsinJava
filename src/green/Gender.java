package green;


public class Gender extends Basicinformation
{


	public void gen(String identififcation)
	{
		switch(identififcation)
		{
		case "M":
			System.out.println("You are Male");
			System.out.println(name);
			break;
		case "F":
			System.out.println("You are FeMale");
			break;
		default:
			System.out.println("You are Transgender");
			break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gender g= new Gender();
		g.gen("M");
		//Basicinformation b= new Basicinformation();
		g.age(1990);
		

	}

}
