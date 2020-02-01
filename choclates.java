

import java.util.Scanner;
class choclates
{
public static void main(String args[])
{
int students,choclates,i;
Scanner s=new Scanner(System.in);
System.out.println("enter number of students");
students=s.nextInt();
System.out.println("enter no of choclates");
choclates=s.nextInt();
for(i=0;i<=n;i++)
{
if(choclates>1)
{
choclates=choclates-i;
}
else
{
--n;
System.out.println("remaining choclates"+choclates+"upto children"+students);
}
}
}
}