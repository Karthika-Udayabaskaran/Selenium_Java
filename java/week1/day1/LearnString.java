package week1.day1;

public class LearnString {

	public static void main(String[] args) {

		String s= "TestLeaf";
		String s2="academy";

		String st = new String("testleaf");


		//Length of the String
		int strlength = s.length();

		System.out.println("Length of the String: " +strlength);

		//Compare 2 strings 

		boolean compareTo = s.equals(st);
		boolean compare2 = s.equals(st);	
		System.out.println(compareTo);
		System.out.println(compare2);	

		//Comparing using ==

		if (s==st) {
			System.out.println("value is same  ");

		}

		else
		{
			System.out.println("not same-compare  memory allocation");
		}


		if (s.equals(st)) {
			System.out.println("same- compare the value  ");

		}

		else
		{
			System.out.println("not same");
		}

		//equals
		boolean compareToIgnoreCase = s.equalsIgnoreCase(st);
		System.out.println(compareToIgnoreCase);

		//contains- case sensitive 

		boolean containschar = s.contains("Leaf");
		System.out.println(containschar);

		//Array of characters
		char[] charArray = s.toCharArray();
		System.out.println(charArray);
		//Print the characters of the string 
		for (int i = 0; i < charArray.length; i++) {

			System.out.println(charArray[i]);

		}
		//Reverse a string
		for (int i = charArray.length-1; i >=0; i--) {

			System.out.println(charArray[i]);

		}
	}


}
