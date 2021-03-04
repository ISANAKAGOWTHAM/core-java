import java.util.Scanner;
class special{
public static void main (String [] args){
int n,r,t,sum,mul,add;
System.out.println("enter the number");
Scanner sc=new Scanner(System.in);
n= sc.nextInt();
t=n;
r=n%10;
n=n/10;
sum=r+n;
mul=r*n;
add=sum+mul;
if(t==add)
System.out.println("special digit number");
else
System.out.println("not a special digit number");
}
}