package green;

public class Academicyear extends Gender
{

	public void marks()
	{
		System.out.println("Your mark in Maths: 75");
		System.out.println("Your mark in Tamil: 55");
		System.out.println("Your mark in English: 45");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Academicyear a= new Academicyear();
		a.marks();
		a.age(1999);
		a.gen("F");
	}

}
