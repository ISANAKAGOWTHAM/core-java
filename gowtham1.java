import java.util.Scanner;

public class gowtham1 {

	public static void main(String[] args) {
		String rev="";
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		int length=str.length();
		for(int i=length-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
			if(str.equals(rev)) {
				System.out.println("palibdrome string : " +str);
			}
			else {
				System.out.println("not a palindrome string :" +str);
			}
			
		

	}

}
