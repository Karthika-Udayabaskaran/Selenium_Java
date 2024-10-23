package week1.day1;

public class Methods {

	public static void main(String[] args) {
		
		Methods obj=new Methods();
		obj.addTwoNumbers(2, 5, 3);
		System.out.println(obj.noOfBicycle());
		System.out.println(obj.CycleData("BSA", "Red",123));
	}
public	void addTwoNumbers(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}

	int noOfBicycle()
	{
	return 3  ;

	}
	String CycleData(String name,String Colour,int nu) {
		return name+ " "+ Colour + nu ;
		

	}
}
