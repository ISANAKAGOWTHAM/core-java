package das;
import java.util.Scanner;


public class pal {

	public static void main(String[] args) {
	int r,sum=0,temp;
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	n=sc.nextInt();
	temp=n;
	while(n>0) {
		r=n%10;
		sum= sum*10+r;
		n=n/10;
	}
		if(temp==sum) {
			System.out.println("palindrone number");
		}
		else {
			System.out.println("not palindrome");
		}
	
	

	}

}
