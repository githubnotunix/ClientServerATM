import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class client {
	public static void main(String args[]) throws IOException {
	int number, balance, temp, withdraw, deposit;
	Scanner sc = new Scanner(System.in);
	Socket s = new Socket("10.35.3.25", 123);
	Scanner sc1 = new Scanner(s.getInputStream());
	System.out.println("Automated Teller Machine");
    System.out.println("Choose 1 for Withdraw");
    System.out.println("Choose 2 for Deposit");
    System.out.println("Choose 3 for Check Balance");
    System.out.println("Choose 4 for EXIT");
	number = sc.nextInt();
	PrintStream p = new PrintStream(s.getOutputStream());
	p.println(number);
	while(true)
	{
		if(number == 1 || number == 2 || number == 3) {
			balance = sc1.nextInt();
			System.out.println("Current Balance " + balance);
			System.out.println("");
			System.out.println("Automated Teller Machine");
		    System.out.println("Choose 1 for Withdraw");
		    System.out.println("Choose 2 for Deposit");
		    System.out.println("Choose 3 for Check Balance");
		    System.out.println("Choose 4 for EXIT");
			number = sc.nextInt();
			p.println(number);
		}
		else if(number != 1 || number != 2 || number != 3 || number != 4){
            	System.out.println("That is not a valid option");
    			System.out.println("Automated Teller Machine");
    		    System.out.println("Choose 1 for Withdraw");
    		    System.out.println("Choose 2 for Deposit");
    		    System.out.println("Choose 3 for Check Balance");
    		    System.out.println("Choose 4 for EXIT");
            	number = sc.nextInt();
            	p.println(number);
		}
			
	}
	}
}