package das;

public class employe {
	String name;
	employe(String n)
	{
		name=n;
		
	}

	public static void main(String[] args) {
		employe e1=new employe("gowtham");
		employe e2=new employe("karthik");
		System.out.println(e1.name);
		System.out.println(e2.name);

	}

}
