package das;
import java.util.Scanner;
public class largest {

	public static void main(String[] args) {
		int num1,num2,num3,temp,result;
		Scanner sc= new Scanner(System.in);
		System.out.println(" enter the first number");
		num1= sc.nextInt();
		System.out.println(" enter the second number");
		num2= sc.nextInt();
		System.out.println( "enter the third number");
		num3= sc.nextInt();
		
		sc. close();
		
		
		temp=num1>num2? num1:num2;
		result=num3>temp? num3:temp;
		System.out.println("largest number id:" + result );

	}

}
