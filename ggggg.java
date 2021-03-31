

	import java.util.Scanner;
	public class ggggg {
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
	 int n,rev=0;
	 n=sc.nextInt();
	 while(n!=0) {
		 int sum=n%10;
		 rev=rev*10+sum;
		 n/=10;
	 }
	 System.out.println("reversed number :" +rev);

	}

}
