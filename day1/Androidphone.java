package week3.day1;

public class Androidphone extends Smartphone{
			

			public void takevideo() {
				System.out.println("takevideo");
			}
			public void sendmsg() {
				System.out.println("You are beautiful");
			}
			
			public static void main (String[]args) {
				
			Androidphone phone = new Androidphone ();
			phone.takevideo();
			phone.sendmsg();
			phone.savecontact();
		
		}
}

