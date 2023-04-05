import java.util.Scanner;
class BouncyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();

		if(isBouncy(num))
		{
			System.out.println("It's Bouncy Number");
		}
		else
		{
			System.out.println("It's not a Bouncy Number");
		}

	}

	public static boolean isBouncy(int n)
	{
		boolean inc = false, dec = false;

		while(n > 0)     // 1253
		{
			int n1 = n % 10;    //3

			n /= 10;           // 125

			int n2 = n % 10;   //5

			if(n == 0)
			{
				break;
			}

			if(n1 > n2)
			{
				dec = true;
			}
			else if(n1 < n2)
			{
				inc = true;
			}

			if(dec == true && inc == true)
			{
				return true;
			}
		}

		return false;
	}
}
