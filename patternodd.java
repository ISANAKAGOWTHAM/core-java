package das;

public class patternodd {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			for(int j=0;j<=10-i;j++){  
				System.out.print(" ");
			}
			
				for(int k=1;k<=2*i-1;k++) {
				   System.out.print("*");
			}
			System.out.println( );
			
		}
	}
}
		// TODO Auto-generated method stub

	


