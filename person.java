
public class person {
	void washhands() {
		System.out.println("wash the hands");
		
		
	}
	void eat() {
		System.out.println("eat the food");
	}
	void serveplates() {
		System.out.println("serve the plates");
	}
	

	public static void main(String[] args) {
		person p=new person();
		p.washhands();
		p.serveplates();
		p.arrageplates();
		p.washhands();
		

	}
	void arrageplates() {
		System.out.println("aarrage the plates");
	}

}
