import java.util.Scanner;
class Avg
{
public static void main(String args[])
{

//variable declartion

double a,b,c,avg;
Scanner sc=new Scanner(System.in);
System.out.println("enter ist number");
a=sc.nextDouble();
System.out.println("Enter 2nd number");
b=sc.nextDouble();
System.out.println("Enter 3rd number");
c=sc.nextDouble();
avg=(a+b+c)/3;
}
}