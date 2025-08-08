import java.util.Scanner;
public class AtmMain {	
	private static int status;

	public static void main(String[] args) {
		
		AtmOperationsInterface op=new AtmOperationsImplementation();
		int atmnumber=12345;
		int atmpin=123;
		Scanner scanner = new Scanner(System.in);
		System.out.println("welcome to ATM Machine!");
		System.out.print("Enter atm number: ");
		int atmnumber1 = scanner.nextInt();
		System.out.print("Enter pin: ");
		int atmpin1 = scanner.nextInt();
		if((atmnumber==atmnumber1) &&(atmpin==atmpin1))
		{
			while(true)
			{
				System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit amount\n4.View MiniStatement\n5.Exit");
				System.out.println("Enter choice :");
				int ch = scanner.nextInt();
				if(ch==1)
				{
					op.viewBalance();
				}
				else if(ch==2)
				{
					System.out.println(" Enter amount to withdrawn");
					double withdrawAmount = scanner.nextDouble();
					op.withdrawAmount(withdrawAmount);
				}
				else if(ch==3)
				{
					System.out.println("Enter Amount to Deposit:");
					double depositAmount = scanner.nextDouble();
					op.depositAmount(depositAmount);
				}
				else if(ch==4)
				{
					op.viewMiniStatement();
				}
				else if(ch==5)
				{
					System.out.println("Collect your ATM Card\n Thank you for choosing ATM Machine");
					System.exit(status);
				}
				else
				{
					System.out.println("Please enter correct choice");
				}
			}
		}
		else
		{
			System.out.println("Incorrect ATM Number or pin");
			System.exit(status);
		}

		scanner.close();
	}

}
