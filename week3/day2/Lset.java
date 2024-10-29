package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lset {

	public static void main(String[] args) {
		int[]  num= {2, 4, 5, 5, 7, 3, 4};
		
		//declare 
		Set <Integer> unique = new LinkedHashSet <Integer> ();
		
		Set <Integer> duplicate = new LinkedHashSet <Integer> ();
		
		for (int i = 0; i < num.length; i++) {
			
			boolean add = unique.add(num[i]);
			
			if (!add) {
				
				duplicate.add(num[i]);
			}

		
			
		}
		System.out.println("Unique Value:" +unique);		

		System.out.println("Unique Value:" +duplicate);	
	}

}
