package week3.day1;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		
		 List<String> lang = new ArrayList <String> ();
		 lang.add("C#");
		 lang.add("java");
		 lang.add("seleni");
		 lang.add("api");
		 lang.add("vb");
		 lang.add("appium");
		 lang.add(2, "Test");

		 
		 System.out.println(lang);
		 
		 
		 //Size
		 int size = lang.size();
		 System.out.println(size);
		 
		 //retrive particular value
		 
		 String getvalue = lang.get(5);
		 System.out.println(getvalue);
		 
		 //Remove all element 
		// lang.clear();
		 System.out.println(lang);
		 
		 //Remove speific value
		System.out.println(
		 lang.remove(5));
		 System.out.println(lang);		 
		 
		 
	
		 //addAll
		 
		 List<String> qa = new ArrayList <String>();
		 qa.add("JIRA");
		 qa.add("ALM");
		 
		 //Add all the collection value together
		 qa.addAll(lang);
		 
		 System.out.println(qa);
 	}
	

}
