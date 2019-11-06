import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {
	public static void main(String args[]) throws IOException {
		String withdraw, deposit, number;
		int balance = 10000;

		ServerSocket s1 = new ServerSocket(123);
		Socket ss = s1.accept();
		Scanner sc = new Scanner(ss.getInputStream());
		Scanner scanner = new Scanner(System.in);
		PrintStream p = new PrintStream(ss.getOutputStream());
		
			
		while (true) {
			number = sc.nextLine();
			int parsedInt = Integer.parseInt(number);
			switch (parsedInt) {
			case 1:
				if (sc.hasNextLine()) {
					withdraw = sc.nextLine();
					int withdrawInt = 0;
					try {
						withdrawInt = Integer.parseInt(withdraw);
					} catch (Exception e) {
						System.out.println("Error: " + e.toString());
					}
					p.println(balance);
					if (balance >= withdrawInt) {
						balance = balance - withdrawInt;
						p.println(balance);
						break;
					} else {

					}
					System.out.println("");
				} else {
					
				}
				break;

			case 2:
				deposit = sc.nextLine();
				int depositInt = Integer.parseInt(deposit);
				balance = balance + depositInt;
				p.println(balance);
				System.out.println("");
				break;

			case 3:
				p.println(balance);
				break;

			case 4:
			}
		}
	}
}
