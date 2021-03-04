import java.util.Scanner;
class digit{
public static void main(String [] args){
int n;
Scanner sc= new Scanner(System.in);
System.out.println("enter the number");
n= sc.nextInt();
if (n<=9)
System.out.println("digit ");
else
System.out.println("number");
}
}