package worldpay.training.ioapi;
import java.util.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;



public class EmployeeInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee eno,ename,sal,desg,dept");
		int eno=sc.nextInt();
		String ename=sc.next();
		int sal=sc.nextInt();
		String desg=sc.next();
		String dept=sc.next();
		
		Employee emp=new Employee();
		emp.addEmployeeDetails(eno, ename, sal, desg, dept);
		
		try {
			FileOutputStream fos=new FileOutputStream("P:/employeedata.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(emp);
			oos.close();fos.close();
			System.out.println("Employee data saved in file");
			
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
		
		

	}

}
