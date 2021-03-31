import java.util.Scanner;
public class area {
	 double r;

	public static void main(String[] args) {
		 
		 System.out.println("enter the number");
		 Scanner sc= new Scanner (System.in);
		
		 double r= sc.nextDouble();
		  double area =3.14*r*r;
		  double circumference=2*3.14*r;
		  System.out.println(" area is :" +area);
		  System.out.println("circumference of aa circle is :" +circumference);
		 
		 

	}

}
