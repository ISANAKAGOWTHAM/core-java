package das;

public class Person {
	void washhands() {
		System.out.println("wash hands");
	}
	void eat() {
		System.out.println("person eats");
	}

	public static void main(String[] args) {
		Person P=new Person();
		P.washhands();P.arrageplates();P.servefood(); P.eat();P.washhands();
	}
	
		void arrageplates() {
			System.out.println("arrage food");
		}
		void servefood() {
			System.out.println("serve food");
		}
		

	}


