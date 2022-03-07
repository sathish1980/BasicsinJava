package green;

public class abstractclassimplementation extends abstractclass
{

	public void sports()
	{
		System.out.println("sports details are");
	}
	@Override
	public void mark() {
		System.out.println("Mark in Maths1 : 50");
		System.out.println("Mark in science : 80");	
		System.out.println("Mark in Tamil : 90");
	}
	@Override
	public void tour() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abstractclassimplementation ac= new abstractclassimplementation();
		ac.sports();
		ac.studentdetails();
		//ac.mark();
		abstractclass a= new abstractclassimplementation();
		a.mark();
	}
	
	

}
