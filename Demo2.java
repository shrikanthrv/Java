import java.util.Scanner;
class Demo2

{
public static void main(String args[])
{
System.out.println("Welcome customer to loan portal");

double pAmt,noy,roi=9,si;

Scanner sc=new Scanner(System.in);
System.out.println("Enter princiapl amount:");
pAmt=sc.nextDouble();

System.out.println("Enter no of years");

noy=sc.nextInt();
si=(pAmt*noy*roi)/100;
System.out.println("Simple interest  is " + si);
}
}
