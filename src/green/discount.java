package green;

public class discount {
	 String actualgen;
	 double tickeckcost=120;
	public String gender(String gend)
	{
	switch (gend.toUpperCase())
	 {
	 case "M":
	     System.out.println("10% offer will be available per ticket");
	      actualgen="Male";
	     break;
	 case "F":
	     System.out.println("20% offer will be available per ticket");
	      actualgen="FeMale";
	     break;
	 default:
	 System.out.println("No Offers are available");
	 break;
	 }
	return actualgen;
	}
	
	public void ticket(int totaltickets,String Gender)
	{
	String ge=gender(Gender);
	if(totaltickets>=10)
	{
	System.out.println("No Offers are available per ticket");
	}

	else if((totaltickets<10)&&(ge=="Male"))
	{
	//int diff =10-totaltickets;
	
	double	discount = (tickeckcost-tickeckcost*0.1);
	double perticketdiscount =tickeckcost-discount;
	double overallticketdiscount=perticketdiscount*totaltickets;
	double overallticketcostwithoutdiscount=totaltickets*tickeckcost;
	double overallticketcostwithdiscount=overallticketcostwithoutdiscount-overallticketdiscount;
	System.out.println("per ticket discount is: "+perticketdiscount);
	System.out.println("overall ticket discount is: "+overallticketdiscount);
	System.out.println("you have to pay : Rs. "+overallticketcostwithdiscount);
	}
	else if((totaltickets<10)&&(ge=="FeMale"))
	{
	//int diff =10-totaltickets;
	
	double	discount = (tickeckcost-tickeckcost*0.2);
	double perticketdiscount =tickeckcost-discount;
	double overallticketdiscount=perticketdiscount*totaltickets;
	double overallticketcostwithoutdiscount=totaltickets*tickeckcost;
	double overallticketcostwithdiscount=overallticketcostwithoutdiscount-overallticketdiscount;
	System.out.println("per ticket discount is: "+perticketdiscount);
	System.out.println("overall ticket discount is: "+overallticketdiscount);
	System.out.println("you have to pay : Rs. "+overallticketcostwithdiscount);
	}
	else
	{
	int diff =10-totaltickets;
	System.out.println("There is no offer if you want offer book extra "+diff+" tickets");
	}
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		discount d = new discount();
		//d.gender("F");
		d.ticket(5,"F");
	}

}
