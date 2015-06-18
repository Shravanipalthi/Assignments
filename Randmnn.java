import java.util.Scanner;
class Nas
{
	public static void main(String[] args) 
	{
		int n,r,k;
		System.out.println("Enter the highest range:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("guess the random number:");
		k=sc.nextInt();
		while(true)
		{
			r=(int)(Math.random()*n);
			if(r<k)
			{
				System.out.println("too low");
                                System.out.println("random number generated is:"+r);
			}
			else if(r>k)
			{	
				System.out.println("too high");
                                System.out.println("random number generated is:"+r);
			}
			else
			{
				System.out.println("found");
				System.exit(0);
			}
		}
	}
}
