import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the number");
		int m,n ,s=0;
		 m=sc.nextInt();
	
		while(m>0) {
			n=m%10;
			s =s+n;
			m=m/10;
			
			 
		}
		System.out.println(" sum of digits :" +s);
		

	}

}
