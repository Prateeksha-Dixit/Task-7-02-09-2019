package worldpay.training.ioapi;

import java.io.PrintStream;
import java.util.Scanner;

public class CitiesFile {
	public static void main(String[] args) throws Exception {
		String file = "P:/abc.txt";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter done to terminate");
		PrintStream ps= new PrintStream(file);
		String line;
		while ((line =scan.nextLine()) != null) 
		{
			if (line.equalsIgnoreCase("done")) 
			{
				System.exit(0);
			}
			ps.println(line);
		}
		System.out.println("Cities stored successfully");
		scan.close();
		ps.close();
	}
}
