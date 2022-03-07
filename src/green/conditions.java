package green;

public class conditions {

	public void voterid(int age)
	{
		if(age>18)
		{
			System.out.println("you are eligible to apply voter id");
			if(age>65)
			{
				System.out.println("you are eligible to apply voter id ans senior citizen");
				
				if(age>80)
				{
					System.out.println("you are eligible to apply voter id and super senior citizen");
					
				}
			}
		}
		else if(age>15)
		{
			System.out.println("you are not eligible to apply voter id but you can apply in next 3 year");
		}
		else if(age>10)
		{
			System.out.println("you are not eligible to apply voter id but you can apply in next 8 year");
			
		}
		else
		{
			System.out.println("you are not eligible to apply voter id ");
			
		}
	}
	
	public void gender(String gen)
	{
		switch(gen)
		{
		case "M":
			System.out.println("you are male");
			break;
		case "F":
			System.out.println("you are Female");
			break;
		default:
			System.out.println("you are Transgender");
			break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conditions c= new conditions();
		c.voterid(75);
		c.gender("G");
	}

}
