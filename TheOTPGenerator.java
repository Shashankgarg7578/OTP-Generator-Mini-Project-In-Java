import java.util.Random;
import java.util.Scanner;

public class TheOTPGenerator 
{
	void showOTPV1()
	{
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number from 5 to 10: ");
		int num = sc.nextInt();
		if(num >= 5 && num <= 10)
		{
			System.out.print("OTP of "+num+" digits is ");
			
			for(int i = 1; i <= num; i++)
			{
				System.out.print(r.nextInt(10));
			}
		}
		else
		{
			System.out.println("invalid number");
		}
	}

	void showOTPV2()
	{
		Random r = new Random();

		for(int i = 1; i <= 4; i++)
		{
			System.out.print((char)(65 + r.nextInt(26)));
		}
	
		for(int i = 1; i <= 4; i++)
		{
			System.out.print(r.nextInt(10));
		}
	}

	void showOTPV3()
	{
		Random r = new Random();
		
		for(int i = 1; i <= 6; i++)
		{
			if(r.nextInt() < 0)
			{
				if(r.nextInt() % 2 == 0)
				{
					System.out.print
					((char)(65 + r.nextInt(26)));
				}
				else
				{
					System.out.print
					((char)(97 + r.nextInt(26)));
				}
			}
			else
			{
				System.out.print
				(r.nextInt(10));
			}
		}
	}
	
	public static void main(String[] args) 
	{
		TheOTPGenerator obj = new TheOTPGenerator();
		obj.showOTPV1();
		System.out.println();
		obj.showOTPV2();
		System.out.println();
		obj.showOTPV3();
	}
}