import java.util.Scanner;
class mos
{
	public static void main(String[] args) 
	{
		int n,g,r,k,kk;
		System.out.println("Enter N value::");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		System.out.println("Guess random anumber::");
		g=scan.nextInt();//reading input
		System.out.println("system guesses::");
                r=(int)(n*Math.random());
		do
		{
			if(g<r)//comparing guessed number with random number
			{
				System.out.println(r+"--too high");
                do
                {
					r=g+(int)(((r-g)+1)*Math.random());//decresing the random number range value
                    k=r;
                 }while(r!=k);
            }      
			if(g>r)
			{
				System.out.println(r+"--too low");
                do
                {
                     r=r+(int)(((g-r)+1)*Math.random());//generates numbers from randomnumber to guess number
                     kk=r;
				}while (kk!=r);
             }
             if(r==g)
             {
                 System.out.println(r+"--found");
             }
		}while(g!=r);
	}
}

