package week1.day1;

public class JumpStatement {

	public static void main(String[] args) {
		
		//BREAK STATEMENT
		for(int i=1; i<=10;i++)
		{
			if(i==3)
			{
				System.out.println("Three");
				break;
			}
			System.out.println(i);
		}
	//CONTINUE STATEMENT
	for(int i=1; i<=10;i++)
	{
		if(i==3)
		{
			System.out.println("Three");
			continue;
		}
		System.out.println(i);
	}
}
}
