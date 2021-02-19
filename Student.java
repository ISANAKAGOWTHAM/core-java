package das;

public class Student {
	int id;
    String name;
    Student()
    {
    	id=1;
    	name="gowtham";
    	
    	
    }
	

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s2.id);
		System.out.println(s2.name);

	}

}
