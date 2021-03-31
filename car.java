




public class car {
int id;
String name;
int salary;

 public car(int id,String name,int salary) {
	 this.id =id;
	 this.name=name;
	 this.salary=salary;
	 
	 
 }
 public String toString() {
	 return this.id+" "+this.name+" "+this.salary;
 }
	 
	 
 
	public static void main(String[] args) {
		car e1=new car(1,"lucky",20);
		car e2=new car(2,"gowtham",30);
		
		car e3=new car(3,"pavan",40);
		car e4=new car(4,"guru",50);
		car e5=new car(5,"sai",60);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		System.out.println(e5);
		

	}




}



