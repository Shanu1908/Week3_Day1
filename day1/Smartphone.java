package week3.day1;

public class Smartphone extends Mobile{
	
	public void sendmsg() {
		System.out.println("You are beautiful");
	}
		
		public static void main (String[]args) {
			
			Mobile mobile = new Mobile ();
			Smartphone smartphone = new Smartphone();
			smartphone.sendmsg();
			
		}

		}

