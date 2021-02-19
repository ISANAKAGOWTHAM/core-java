package das;

public class Bike {

	 
		 
		 String clr,model;
		int   price;
		Bike(){
			
		}
		Bike(String clr,String model,int price ){
			this.clr=clr;
			this.model=model;
			this.price=price;
			
			
		}
		
		public static void main(String[] args) {
				Bike b1=new Bike();
				Bike b2=new Bike("white","honor play",16000);
				System.out.println(b1.clr+"  "+b1.model+"  "+b1.price  );
				System.out.println(b2.clr+"   "+b2.model+"  "+b2.price);
			

		}

	
		// TODO Auto-generated method stub

	} 

