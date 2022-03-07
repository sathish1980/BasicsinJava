package green;

public class stringreverse {
	
	String s= "sathish b.tech address kumar R";
			//	hsihtas ramuk R
				//R ramuk hsihtas
				//{'s','a','t',hish kumar R}
	public void stringreve()
	{
		String gen="";
		char[] ch = s.toCharArray();
		int len = ch.length;
		for(int i=len-1;i>=0;i--)
		{
			//System.out.print(ch[i]);
			gen = gen+String.valueOf(ch[i]);
		}
		System.out.print(gen);
	}
	
				public void stringreveswithspace()
				{
					String ident="notdone";
					System.out.println("");
					String[] aftersplit = s.split("\\s");
					int s_len = aftersplit.length;
					for(int j=0;j<s_len;j++)
					{
					
					
						if(aftersplit[j].equalsIgnoreCase("Kumar"))
						{
						char[] ch = aftersplit[j].toCharArray();
						int len = ch.length;
						for(int i=len-1;i>=0;i--)
						{
							System.out.print(ch[i]);
							ident = "done";
						}
						System.out.print(" ");
						break;
						}
						else
						{
							
							char[] ch1 = aftersplit[j].toCharArray();
							int len = ch1.length;
							for(int k=0;k<len;k++)
							{
								System.out.print(ch1[k]);
							}
							System.out.print(" ");
						}
						
					}
					
					
				}
				

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringreverse s = new stringreverse();
		s.stringreve();
		s.stringreveswithspace();
	}

}
