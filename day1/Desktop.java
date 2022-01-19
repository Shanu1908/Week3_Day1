package week3.day1;

public class Desktop extends Computer {

		public void desktopsize() {
			System.out.println("65 cm Wider");
		}
			
			public static void main (String[]args) {

				Computer computer = new Computer ();
				Desktop desktop = new Desktop ();
				computer.computermodel(); 
				desktop.desktopsize();
				
			}

			}

