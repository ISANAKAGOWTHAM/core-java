package das;

public class Factorial {

	public static void main(String[] args) {
		int i ,fact=1;
		int number=4;
		System.out.println("enter the number");
		for(i=1;i<=number;i++) {
			fact=fact*i;
		}
		System.out.println("factorial of"+ number+"is:"+fact);

	}

}
