package green;
import yellow.*;

public class VoterID 
{
	sample s = new sample();
	class2 cs= new class2();
	public void age(int currentage)
	{
		if(currentage>18)
		{
			System.out.println("You are eligible to apply voter id");
			if(currentage>60)
			{
				System.out.println("You are eligible to apply voter id and you can avail senior consession");
				if(currentage>80)
				{
					System.out.println("You are eligible to apply voter id and you can avail Super senior consession");
					
														}
				else
				{
					System.out.println("You are eligible to apply voter id and you can avail Super senior consession");
					
				}
				
			}
			else
			{
				
			}
		}
		else if(currentage>15)
		{
			int diff=18-currentage;
			System.out.println("You are not eligible to apply voter id but uyou have to wait for "+diff+" more years");
		
		}
		else if(currentage>10)
		{
			int diff=18-currentage;
			System.out.println("You are not eligible to apply voter id but uyou have to wait for "+diff+" more years");
		}
		else
		{
			int diff=18-currentage;
			System.out.println("You are not eligible to apply voter id but uyou have to wait for "+diff+" more years");
		
		}
	}
	public void gender(String gen)
	{
		switch(gen)
		{
		case "M":
			System.out.println("You are male");
			break;
		case "F":
			System.out.println("You are Female");
			break;
		default:
			System.out.println("You are Transgender");
			break;}
			
		}
	public void alphabets(char alp) 
	{
		if(alp=='A')
		{
			System.out.println("the number is 1");
		}
		else if(alp=='B')
		{
			System.out.println("the number is 2");
		}
		
	}
		
		public void numbers(int num)
		{
			switch(num)
			{
			case 1:
				System.out.println("This is number 1");
				break;
			case 2:
				System.out.println("This is number 2");
				break;
			case 3:
				System.out.println("This is number 3");
				break;
			case 4:
				System.out.println("This is number 4");
				break;
			case 5:
				System.out.println("This is number 5");
				break;
			case 6:
				System.out.println("This is number 6");
				break;
			default:
				System.out.println("This is not a valid number");
				break;
				
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VoterID v=  new VoterID();
		v.age(65);
		v.numbers(8);
		//v.gender("m");
	}

}
