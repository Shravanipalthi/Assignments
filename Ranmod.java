import java.util.Scanner;
class  Randomn
{
	public static void main(String[] args) 
	{
		int n,r,k;
		System.out.println("Enter the highest range:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		r=(int)(Math.random()*(n+1));//code for random function
		System.out.println("guess the random number:");
		k=sc.nextInt();
		while(true)
		{
			if(k<r)
			{
				System.out.println("too low");
				System.out.println("guess the random number:");
				k=sc.nextInt();
			}
			else if(k>r)
			{	
				System.out.println("too high");
				System.out.println("guess the random number:");
				k=sc.nextInt();
			}
			else
			{
				System.out.println("found");
				System.exit(0);
			}
		}
	}
}