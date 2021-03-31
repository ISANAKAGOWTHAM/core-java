import java.util.Scanner;
public class gowtham {
	public static void main(String [] args) {
		int uppercase=0;
		int lowercase=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z') {
				uppercase++;
				
			}
			else if(ch>='a' && ch<='z') {
				lowercase++;
				
			}
		}
		System.out.println("uppercase characters :"+uppercase);
		System.out.println("lowercase characters :"+lowercase);
			
		
	}

}
