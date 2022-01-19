package week3.day1;

public class BankInfo {

public void bankInfoSaving()  {
			    System.out.println("Savings Rs. 40,000");
		}

public void bankInfoFixed()  {
			    System.out.println("Fixed Rs.10000");
		}

public void bankInfoDeposit()  {
    System.out.println("Deposit Rs.10000");
}
		public static void main (String[]args) {

			BankInfo bankInfo = new BankInfo ();
			bankInfo.bankInfoSaving();
			bankInfo.bankInfoFixed();
			bankInfo.bankInfoDeposit();
			
		}
		
		}