import java.util.*;
public class Examination
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(system.in);
		int x,count=0;
		double sum=0;
		while(count<3)
		{
			x =s.nextInt();
			if(x<0)
				sum=sum-1;
			else if(x%2==0)

				sum=sum-0.5;
			else
			{
				sum=sum+1;
				count++;
			}
		}
		System.out.println(sum);
}