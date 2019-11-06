import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {
	public static void main(String args[]) throws IOException {
		int temp = 0;
		String withdraw, deposit;
		String number;
		int balance = 10000;
		ServerSocket s1 = new ServerSocket(123);
		Socket ss = s1.accept();
		Scanner sc = new Scanner(ss.getInputStream());
		Scanner scanner = new Scanner(System.in);
		PrintStream p = new PrintStream(ss.getOutputStream());

		//number = sc.nextInt();
		//temp = sc.nextInt();
		while(true)
		{
			number = sc.nextLine();
			int parsedInt = Integer.parseInt(number);
			/*if(number != 1 || number != 2 || number != 3 || number != 4) {
	            	System.out.println("That is not a valid option");
	    			System.out.println("Automated Teller Machine");
	    		    System.out.println("Choose 1 for Withdraw");
	    		    System.out.println("Choose 2 for Deposit");
	    		    System.out.println("Choose 3 for Check Balance");
	    		    System.out.println("Choose 4 for EXIT");
	            	number = sc.nextInt();
	            }*/
			switch(parsedInt)
			{
			case 1:
					if(sc.hasNextLine()) {
						
						withdraw = sc.nextLine();
						int withdrawInt = 0;
						try {
							withdrawInt = Integer.parseInt(withdraw);
						}
						catch(Exception e) {
							System.out.println("Error: " + e.toString());
						}
						p.println(balance);
						if(balance >= withdrawInt)
						{
							balance = balance - withdrawInt;
							p.println(balance);
							break;
						}
						else
						{
							//System.out.println("Insufficient Balance");
						}
						System.out.println("");
					}
					else {
						System.out.println("Enter a valid number");
					}
				break;

			case 2:
				//System.out.print("Enter money to be deposited:");
				deposit = sc.nextLine();
				int depositInt = Integer.parseInt(deposit);
				balance = balance + depositInt;
				//System.out.println("Your Money has been successfully depsited");
				p.println(balance);
				System.out.println("");
				break;

			case 3:
				//System.out.println("Balance : "/*+balance*/);
				p.println(balance);
				//System.out.println("");
				break;

			case 4:
				//System.out.println("Have a nice day!");
				//s1.setKeepAlive(true, 3000);
				//System.exit(0);
			}
		}
		/*if(number == 1) {
			balance = balance + 0;
		}
		else if(number == 2)
			balance = balance + temp;
		else if(number == 3)
			balance = balance - temp;*/
		//temp = number *2;
		//PrintStream p = new PrintStream(ss.getOutputStream());
		//p.println(balance);
		//s1.close();
		//sc.close();
	}
}
