package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetAssignment {

	public static void main(String[] args) {
		
		String companyName = "google";
		
		char[] charArray = companyName.toCharArray();
		
		Set <Character> unique = new LinkedHashSet <Character> ();
		
		for (int i = 0; i < charArray.length; i++) {
			
			unique.add(charArray[i]);
		}

		System.out.println(unique);
		}
	}

