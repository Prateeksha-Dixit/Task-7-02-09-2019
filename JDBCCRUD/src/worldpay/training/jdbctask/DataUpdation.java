package worldpay.training.jdbctask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DataUpdation {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter salary and employee no to update salary");
		int sal=sc.nextInt();
		int eno=sc.nextInt();
		sc.close();
		
        try {
            //step-1 (Driver-Loading)
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");
            //step-2 (Connection Establishment)
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data", "root", "root");
            System.out.println("Connected Successfully");
            //step-3 (Define SQL Statement)
            System.out.println("SENDING SQL TO DB......");
            String sql="UPDATE EMP set sal='"+sal+"' where eno='"+eno+"'";
            //step-4 (Send the SQL statement to DB)
            Statement stmt=con.createStatement();
            int n=stmt.executeUpdate(sql);
            //step-5 (Close the Database Connection)
            con.close();
            System.out.println(n+" Row Updated");
            
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }


}
