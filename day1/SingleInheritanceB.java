package week3.day1;

public class SingleInheritanceB extends SingleInheritanceA {

	    public void dispB()
	    {
	        System.out.println("disp() method of SingleInheritanceB");
	    }
	    public static void main(String args[])
	    {
	        //Assigning SingleInheritanceB object to SingleInheritanceB reference
	    	SingleInheritanceB b = new SingleInheritanceB();
	        //call dispA() method of SingleInheritanceA
	        b.dispA();
	        //call dispB() method of SingleInheritanceB
	        b.dispB();
	    }
	}

