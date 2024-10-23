package week1.day1;

public class Operators {

	public static void main(String[] args) {
		
		System.out.println("Arithmetic Operators");
		System.out.println("**********************");
		System.out.println(7+7);
		System.out.println(7-7);
		System.out.println(7*7);
		System.out.println(7/7);//quotient
		System.out.println(11%2);//reminder
		
		System.out.println("Assignment Operators");
		System.out.println("**********************");
		int a=5,b=10;
		System.out.println(a+=5);
		System.out.println(a+=10);	
		
		System.out.println("Comparision Operators");
		System.out.println("**********************");		
		System.out.println(5==5);
		System.out.println(5>=10);//is 5 greater than 10
	
		System.out.println("Logical Operators");
		System.out.println("**********************");		
		System.out.println((5==5)&&(5>=10));//both should be true
		System.out.println((5==5)||(5>=10));//any one true
	

		System.out.println("Unary Operators");
		System.out.println("**********************");	
		int x=1;
		//System.out.println(++x);
		System.out.println(x++);
		System.out.println(x);

		System.out.println(--x);
		System.out.println(x--);
		System.out.println(x);
		
		
			}
	
		
	

}
