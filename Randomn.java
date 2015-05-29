import java.util.Scanner;
class  Randomn
{
	public static void main(String[] args) 
	{
		int n,r,k;
		System.out.println("Enter the highest range:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		do
		{
			r=(int)(Math.random()*n);//code for random function
			System.out.println("guess the random number:");
			k=sc.nextInt();
			if(k==1)
			{
				System.out.println("Random number is:"+r);
				System.out.println("too low");
			}
			else if(k==n)
			{
				System.out.println("Random number is:"+r);
				System.out.println("too high");
			}
			else
				System.out.println("the generated random numer is:"+r);
		}while(k!=r);//loop continues upto user number and genrated number is equal
	}
}