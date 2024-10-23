package week1.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String text1="stops";
		String text2 ="potss";	

		//Length of the array

		int txt1length = text1.length();
		int txt2length = text2.length();


		if (txt1length==txt2length) {

			System.out.println("Length are equal");

		} else {

			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");

		}

		//Sort the Character array 


		char[] txt1charArray = text1.toCharArray();
		char[] txt2charArray = text2.toCharArray();

		Arrays.sort(txt1charArray);
		Arrays.sort(txt2charArray);

		for (int i = 0; i < txt1charArray.length; i++) {
			System.out.print(txt1charArray[i]  );
		}

		System.out.print(" ");
		for (int j = 0; j < txt2charArray.length; j++) {

			System.out.print( txt1charArray[j]);
		}

		System.out.print(" ");
		if (txt1charArray ==txt1charArray) {

			System.out.println("The given strings are Anagram");

		} else {

			System.out.println("The given strings are not Anagram");

		}
	}



}
