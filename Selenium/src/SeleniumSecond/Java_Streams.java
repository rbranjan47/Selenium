package SeleniumSecond;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class Java_Streams 
{
	//@Test
	public void regular()
	{
	  List<String> names=new  ArrayList<String>();
	  names.add("rabi");
	  names.add("vivek");
	  names.add("prince");
	  names.add("rahul");
	  names.add("vishal");
	  
	//count number of names start with 'r'  
	int count=0;
	  for(int i=0;i<names.size();i++)
	  {
		  String all_names=names.get(i);
		  
		  if (all_names.startsWith("r"))
		  {
			  count++;
		  }
	  }
	  System.out.println(count);
	}  
	
	
	@Test   //using java streams
	public void namesUsingStrams()
	{
		List<String> names=new  ArrayList<String>();
		  names.add("rabi");
		  names.add("vivek");
		  names.add("prince");
		  names.add("rahul");
		  names.add("vishal");
		  
		 Long c_name= names.stream().filter(a->a.startsWith("r")).count();   //Lambda expression
		  System.out.println(c_name);    // to execute this streams IMPORT JCOMMANDER jar file
		  
		  Long c_vname=names.stream().filter(i->i.startsWith("v")).count();
		  System.out.println(c_vname);
		  
		  //print the names
		  names.stream().filter(a->a.length()>4).forEach(a->System.out.println(a));
		  System.out.println("--------------------------------------------------------------");
		  //filter on name
		  names.stream().filter(a->a.length()>4).limit(1).forEach(a->System.out.println(a));
	}  
}
