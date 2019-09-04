package worldpay.training.jdbctask;

import java.util.Scanner;
import java.sql.*;

public class DataInsertion {

    public static void main(String[] args) {
    	System.out.println("enter employee eno,name,salary,department");
    	Scanner sc=new Scanner(System.in);
    	
    	int eno=sc.nextInt();
    	String ename=sc.next();
    	int sal=sc.nextInt();
    	String dept=sc.next();
        try {
            //step-1 (Driver-Loading)
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");
            //step-2 (Connection Establishment)
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data", "root", "root");
            System.out.println("Connected Successfully");
            //step-3 (Define SQL Statement)
            System.out.println("SENDING SQL TO DB......");
            String sql="INSERT INTO EMP VALUES("+eno+",'"+ename+"',"+sal+",'"+dept+"')";
            //step-4 (Send the SQL statement to DB)
            Statement stmt=con.createStatement();
            int n=stmt.executeUpdate(sql);
            //step-5 (Close the Database Connection)
            con.close();
            System.out.println(n+" Row Added");
            
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}