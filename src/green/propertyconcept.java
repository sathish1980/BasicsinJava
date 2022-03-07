package green;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertyconcept {

	int a=10;
	String filename="C:\\Users\\sathishkumar\\eclipse-workspace\\JAVABasics\\inputfiles\\db.properties";
	public void readdata() throws IOException
	{
		File fs = new File(filename);
		try {
			FileInputStream filestream= new FileInputStream(fs);
			Properties ps= new Properties();
			ps.load(filestream);
			System.out.println(ps.getProperty("loc"));
			System.out.println(ps.getProperty("name"));
			System.out.println(ps.getProperty("age"));
			System.out.println(ps.getProperty("dob"));
			System.out.println(ps.getProperty("age")+ps.getProperty("dob"));
			
			System.out.println(Integer.parseInt(ps.getProperty("age"))+Integer.parseInt(ps.getProperty("dob")));
			ps.setProperty("edu","B.tech");
			System.out.println(ps.getProperty("edu"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void stringhandle()
	{
		String s="SAthish SAkumAr ";
		//char[] sa= {'S','A','t','h','i','s','h',' ','S','A','k',umAr};
		String two="SAthish SAkumAr";
		System.out.println(s.charAt(11));
		System.out.println(s.compareTo(two));//same-0 /positive /negative
		System.out.println(s.equals(two));//Boolean value
		System.out.println(s.equalsIgnoreCase(two));//boolean value
		System.out.println(s.concat(two));//string
		System.out.println(s+two);//string
		System.out.println(s.contains("a"));//boolean value
		System.out.println(s.startsWith("SA"));//boolean value
		System.out.println(s.endsWith("Ar"));//boolean value
		//System.out.println(s.charAt('A'));
		System.out.println(s.indexOf('r'));//integer value(index vaue)
		System.out.println(s.isEmpty());//boolean value
		System.out.println(s.length());//integer value
		System.out.println(s.split("A"));
		String[] newar=s.split("A");
		System.out.println(newar[0] +" "+newar[1]+" "+newar[2]);
		String[] newa1r=s.split("\\s");
		System.out.println(s.replace("A","sa"));//replaced string
		System.out.println(s.substring(4));
		System.out.println(s.substring(0,40));
		char[] nch=s.toCharArray();
		for(int i=0;i<nch.length;i++)
		{
			System.out.println(nch[i]);
		}
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		propertyconcept p = new propertyconcept();
		p.readdata();
	}

}
