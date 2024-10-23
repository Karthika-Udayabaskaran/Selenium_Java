package week1.day1;

public class ConditionalStatement {

	public static void main(String[] args) {
		int marks =90;

		System.out.println("IF CONDITION ");
		System.out.println("*************");
		if (marks >=50)
		{
			System.out.println("The student has passed the exam");	
		}

		System.out.println("IF ...ELSE");
		System.out.println("**********");
		if (marks>96) {
			System.out.println("Oustanding");

		} else {

			System.out.println("Execellent");
		}

		System.out.println("NESTED IF");
		System.out.println("**********");
		
		if (marks>1 && marks<50) {
			System.out.println("fail");

		} else if(marks>51 && marks <69) {

			System.out.println("pass");
		}
		else if(marks>70 && marks <100) {

			System.out.println("distinction");
		}
		
		else  {

			System.out.println("Not attended the exam");
		}
		
	}

}
