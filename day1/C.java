package week3.day1;

public class C extends B{
	
	    public void dispC()
	    {
	        System.out.println("C");
	    }
	    public static void main(String args[])
	    {
	        //Assigning C object to C reference
	      C c = new C();
	        //call A
	        c.dispA();
	        //call B
	        c.dispB();
	        //call C
	        c.dispC();
	    }
	}