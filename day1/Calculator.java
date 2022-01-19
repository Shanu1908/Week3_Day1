package week3.day1;

public class Calculator {
	
public void sum(int num1,int num2)	
	
	{
		int sum = num1+num2;
	System.out.println("Addition of two numbers "+sum);  
	}
		
public void sub(int num1,int num2)	
		
		{
			int sum = num1-num2;
		System.out.println("subtraction of two numbers "+sum);  
		}
public void mult(int num1,int num2)	

{
	int mult = num1*num2;
System.out.println("multiplication of two numbers "+mult);  
}
public void div(int num1,int num2)	

{
	int div = num1/num2;
System.out.println("division of two numbers "+div);  
}

		public static void main(String args[]) {
		
		Calculator calc = new Calculator(); 
calc.sum(25,35);
calc.sub(45,25);
calc.mult(25, 35);
calc.div(10, 5);

}
}
