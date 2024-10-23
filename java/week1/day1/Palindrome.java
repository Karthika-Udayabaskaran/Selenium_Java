package week1.day1;

public class Palindrome {

	public static void main(String[] args) {


		int input =121;

		int orginput=input;
		
		int output=0;

		while(input !=0)
		{
			output=output*10 + input%10;
			input=input /10;

		}

		System.out.println("The Output is:" +output);
		
		if (orginput==output) 
		{
			System.out.println("Number is Palindrome " +orginput);

		} else {
			System.out.println("Number is  not Palindrome "  +orginput);
		}

	}

}
