
public class car1 {
	String name;
	int price;
	String colour;
	car1(int p,String n,String c){
		name=n;
		colour=c;
		price=p;
		
	}

	public static void main(String[] args) {
		car1 c1=new car1(20,"nano","blue");
		car1 c2=new car1(30,"inova","white");
		System.out.println(c1.price+" "+c1.name+" "+c1.colour);
		System.out.println(c2.price+" "+c2.name+" "+c2.colour);

	}

}
