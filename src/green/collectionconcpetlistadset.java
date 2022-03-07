package green;

import java.util.*;
/*import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;*/

public class collectionconcpetlistadset {

	//int[] AL= {1,2,7,4,5,1};
	public void listandset()
	{
		ArrayList<Integer> AL = new ArrayList<>();
		AL.add(1);
		AL.add(2);
		AL.add(3);
		AL.add(4);
		AL.add(5);
		AL.add(8);
		AL.add(1);
		
		AL.set(2, 7);
		AL.remove(5);
		//1,2,7,4,1
		System.out.println(AL);
		Iterator i=AL.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next());
		}
	}
	
	public void listandsetstring()
	{
		//ArrayList<Object> AL = new ArrayList<>();
		LinkedList<Object> AL = new LinkedList<>();
		AL.add("sathish");
		AL.add("kumar");
		AL.add("R");
		AL.add("B.tech");
		AL.add("IT");
		AL.add("testing");
		AL.add("sathish");
		AL.add(1);
		
		AL.set(2, "r");
		AL.remove(4);
		//1,2,7,4,1
		System.out.println(AL);
		Iterator i=AL.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	
	public void setinter()
	{
		//ArrayList<Object> AL = new ArrayList<>();
		//HashSet<Object> AL = new HashSet<>();
		//LinkedHashSet<Object> AL = new LinkedHashSet<>();
		TreeSet<Object> AL = new TreeSet<>();
		AL.add("sathish");
		AL.add("kumar");
		AL.add("sathish");
		AL.add("R");
		AL.add("B.tech");
		AL.add("IT");
		AL.add("testing");
		AL.add(" ");
		//AL.add(1);
		
		//AL.set(2, "r");
		AL.remove("B.tech");
		//1,2,7,4,1
		System.out.println(AL);
		Iterator i=AL.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	
	
	public void mapconcept()
	{
		HashMap<Integer,String> hp= new HashMap<Integer,String>();
		hp.put(0, "name");
		hp.put(1, "sathish");
		hp.put(2, "R");
		hp.put(3, "sathish");
		hp.put(3, "sara");
		hp.put(4, "B.tech");
		hp.put(5, "kumar");
		hp.remove(5);
		

		System.out.println(hp.size());
		
		for(int i=0;i<=hp.size();i++)
		{
			System.out.println(hp.get(i));
			
		}
		
		
	}
	
	public void mapconceptstring()
	{
		//HashMap<String,String> hp= new HashMap<>();
		//LinkedHashMap<String,String> hp= new LinkedHashMap<>();
		TreeMap<String,String> hp= new TreeMap<>();
		
		hp.put("name", "sathish");
		hp.put("sname", "kumar");
		hp.put("itial", "R");
		hp.put("dup", "sathish");
		hp.put("degree", "B.tech");
		hp.put(" ", "null value");
		hp.remove("degree");
		
		System.out.println(hp.get("name"));
		
		for(Map.Entry ma:hp.entrySet())
		{
			System.out.println(ma.getKey() +" " + ma.getValue());
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		collectionconcpetlistadset cp = new collectionconcpetlistadset();
		cp.mapconceptstring();
	}

}
