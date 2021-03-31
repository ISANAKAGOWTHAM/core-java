




public class employe {
int id;
String name;
int salary;

 public employe(int id,String name,int salary) {
	 this.id =id;
	 this.name=name;
	 this.salary=salary;
	 
	 
 }
 public String toString() {
	 return this.id+" "+this.name+" "+this.salary;
 }
	 
	 
 
	public static void main(String[] args) {
		employe e1=new employe(1,"lucky",20);
		employe e2=new employe(2,"gowtham",30);
		
		employe e3=new employe(3,"pavan",40);
		employe e4=new employe(4,"guru",50);
		employe e5=new employe(5,"sai",60);
		

	}


,

}
