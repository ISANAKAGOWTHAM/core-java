package das;
import java.util.Scanner;


public class cal {

	public static void main(String[] args) {
		double num1,num2;
		Scanner scanner=new Scanner(System.in);
		System.out.println(" enter first number");
		num1=scanner.nextDouble();
		System.out.println(" enter the second number");
		num2= scanner.nextDouble();
		System.out.println(" operator (+,-,*,/):");
		char operator=scanner.next().charAt(0);
		
		
		double output;
		switch(operator) {
		case '+':
			output=num1+num2;
			break;
		case '-':
			output=num1-num2;
			break;
		case '*':
			output=num1*num2;
			break;
		case '/':
			output=num1/num2;
			break;
			
			default:
				System.out.println(" wrong operator");
				return;
				
		}
		System.out.println(num1+" "+operator+" "+num2+" :" +output);

	}

}
