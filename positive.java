import java.util.Scanner;
class positive{
public static void main(String [] args){
int n;
Scanner sc= new Scanner(System.in);
System.out.println("enter the number");
n=sc.nextInt();
if(n>0)
System.out.println("positive number");
else if(n<0)
System.out.println("negative number");

else
System.out.println("invalid");
}
}