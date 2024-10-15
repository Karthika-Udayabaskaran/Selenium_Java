package week1.day1;

public class IsPrime {

	public static void main(String[] args) {



		for(int i=1; i<=10;i++)
		{
			boolean isPrime = true;
			
			if(i>1)
			{

				for(int j =2;j<i;j++)
				{
					if(i%j==0)
					{
						isPrime=false;
					}
				}
			}

			else
			{
				isPrime=false;
			}
			if(isPrime)
			{
			System.out.println("Prime number are:" +i);
		}


		}


	}
}
