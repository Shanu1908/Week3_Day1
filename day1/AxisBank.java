package week3.day1;

public class AxisBank extends BankInfo{

	public void deposit()  {
	    System.out.println("Deposit Rs. 40,000");
}

public void bankInfoDeposit()  {
    System.out.println("Deposit Rs.20000");
}
public static void main (String[]args) {

	AxisBank axisbank = new AxisBank ();
	axisbank.deposit();
	axisbank.bankInfoDeposit();
	
	
}
}