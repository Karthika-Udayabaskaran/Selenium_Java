package week1.day1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		int firstnum = s.nextInt();
		
		int secondnum= s.nextInt();
		
		for (int i = 0; i < 8; i++) {
			
			System.out.println(firstnum);
					
			int nextnum=firstnum+secondnum;
			
			firstnum=secondnum;
			
			secondnum=nextnum;	
		}
		
	}
}