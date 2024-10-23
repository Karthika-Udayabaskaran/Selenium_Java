package week1.day1;

import java.util.Iterator;

public class Loops {

	public static void main(String[] args) {

		System.out.println("FOR LOOP- PRINT NUM 0-5");
		System.out.println("-----------------------");

		for(int i =1; i<=5;i++)

		{

			System.out.println("The number is: " +i);
		}

		System.out.println("FOR LOOP- PRINT NUM 5-0");
		System.out.println("-----------------------");

		for(int i=5;i>=1;i--)

		{

			System.out.println("The number is: " +i);
		}

		System.out.println("PRINT EVEN NUMBERS 1-10");
		System.out.println("-----------------------");

		for(int i=1;i<=10;i++)

		{

			if(i%2==0)

			{
				System.out.println("Even Numbers are :" +i);	
			}
		}
				}


	}