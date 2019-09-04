package worldpay.training.ioapi;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class DisplayInfo  {

	public static void main(String[] args) throws Exception {
		
		Employee emp=null;
		System.out.println("Already an employee Y/N");
		Scanner sc=new Scanner(System.in);
		String choice=sc.next();
		sc.close();
		if(choice.equals("Y"))
		{
			
			FileInputStream fis=new FileInputStream("P:/employeedata.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			emp=(Employee)ois.readObject();
			System.out.println("Employee data:");
			emp.showInfo();
			ois.close();fis.close();
			
		}
		else
			System.out.println("Employee Data not exists");
		

	}

}
