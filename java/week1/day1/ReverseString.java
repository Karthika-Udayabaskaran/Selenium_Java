package week1.day1;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		String StrName = s.nextLine();
		
		System.out.println("Orginal String Value: " +StrName);
		
		char[] charArray = StrName.toCharArray();
		
		for (int i = charArray.length-1; i >=0 ; i--) {
			
			System.out.print(charArray[i]);
			
		}
		
	}

}
