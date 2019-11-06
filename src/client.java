import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class client {
	public static void main(String args[]) throws IOException {
	int balance, temp;
	int withdrawInt;
	String number, withdraw, deposit;
	Scanner sc = new Scanner(System.in);
	Socket s = new Socket("127.0.0.1", 123);
	Scanner sc1 = new Scanner(s.getInputStream());
	System.out.println("Automated Teller Machine");
    System.out.println("Choose 1 for Withdraw");
    System.out.println("Choose 2 for Deposit");
    System.out.println("Choose 3 for Check Balance");
    System.out.println("Choose 4 for EXIT");
	
	PrintStream p = new PrintStream(s.getOutputStream());
	//p.println(number);
	number = sc.nextLine();
	p.println(number);
	while(true)
	{
		if(number.equals("1"))
		{
			while(true) {
			System.out.println("Enter an amount to withdraw");	
			while(true) {
				withdraw = sc.nextLine();
			try {
				withdrawInt = Integer.parseInt(withdraw);
				break;
			}
			catch(NumberFormatException e) {
				System.out.println("Type in a valid amount to withdraw");
			}
			}
			p.println(withdraw);
			balance = sc1.nextInt();
			if(balance >= withdrawInt)
			{
				//balance = balance - withdrawInt;
				//p.println(balance);
							balance = sc1.nextInt();
			System.out.println("Current Balance: " + balance);
			System.out.println("");
			System.out.println("Automated Teller Machine");
		    System.out.println("Choose 1 for Withdraw");
		    System.out.println("Choose 2 for Deposit");
		    System.out.println("Choose 3 for Check Balance");
		    System.out.println("Choose 4 for EXIT");
			number = sc.nextLine();
			p.println(number);
				break;
			}
			else
			{
				System.out.println("Insufficient Balance");
				System.out.println("Automated Teller Machine");
			    System.out.println("Choose 1 for Withdraw");
			    System.out.println("Choose 2 for Deposit");
			    System.out.println("Choose 3 for Check Balance");
			    System.out.println("Choose 4 for EXIT");
				number = sc.nextLine();
				p.println(number);
				break;
			}
			

		}
		}
		else if(number.equals("2"))
		{
			System.out.println("Enter amount to deposit");
			while(true) {
				deposit = sc.nextLine();
			try {
				int depositInt = Integer.parseInt(deposit);
				break;
			}
			catch(NumberFormatException e) {
				System.out.println("Type in a valid amount to deposit");
			}
			}
			p.println(deposit);
			balance = sc1.nextInt();
			System.out.println("Current Balance: " + balance);
			System.out.println("");
			System.out.println("Automated Teller Machine");
		    System.out.println("Choose 1 for Withdraw");
		    System.out.println("Choose 2 for Deposit");
		    System.out.println("Choose 3 for Check Balance");
		    System.out.println("Choose 4 for EXIT");
			number = sc.nextLine();
			p.println(number);
		}
		else if(number.equals("3"))
		{
			//System.out.println("Enter amount");
			balance = sc1.nextInt();
			System.out.println("Current Balance: " + balance);
			System.out.println("");
			System.out.println("Automated Teller Machine");
		    System.out.println("Choose 1 for Withdraw");
		    System.out.println("Choose 2 for Deposit");
		    System.out.println("Choose 3 for Check Balance");
		    System.out.println("Choose 4 for EXIT");
			number = sc.nextLine();
			p.println(number);
		}
		/*if(number == "1" || number == "2" || number == "3") {
			balance = sc1.nextInt();
			System.out.println("Current Balance " + balance);
			System.out.println("");
			System.out.println("Automated Teller Machine");
		    System.out.println("Choose 1 for Withdraw");
		    System.out.println("Choose 2 for Deposit");
		    System.out.println("Choose 3 for Check Balance");
		    System.out.println("Choose 4 for EXIT");
			number = sc.nextLine();
			p.println(number);
		}*/
		else if(number.contentEquals("4")) {
			try {
				
				System.exit(0);
			}
			catch(Exception e){
				System.out.println("Have a nice day");
			}
		}
		else{
            	System.out.println("That is not a valid option");
    			System.out.println("Automated Teller Machine");
    		    System.out.println("Choose 1 for Withdraw");
    		    System.out.println("Choose 2 for Deposit");
    		    System.out.println("Choose 3 for Check Balance");
    		    System.out.println("Choose 4 for EXIT");
            	number = sc.nextLine();
            	p.println(number);
		}
		/*else {
			
		}*/
			
	}
	//s.setKeepAlive(true);
	}
}