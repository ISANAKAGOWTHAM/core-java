package das;

public class car {
	String colour;
	String name;
	int price;
	car(String c,String n,int p)
	{
		colour=c;
		name=n;
		price=p;
	}

	public static void main(String[] args) {
		car c1=new car("pink","nano",350000);
		car c2=new car("black","inova",2100000);
		System.out.println(c1.colour);
		System.out.println(c1.name);
		System.out.println(c1.price);
		System.out.println();
		System.out.println(c2.colour);
		System.out.println(c2.name);
		System.out.println(c2.price);
		
			

	}

}
