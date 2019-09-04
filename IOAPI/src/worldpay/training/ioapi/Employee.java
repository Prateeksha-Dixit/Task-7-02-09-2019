package worldpay.training.ioapi;
import java.io.Serializable;

public class Employee implements Serializable{
	
	private int eno;
	private String ename;
	private int sal;
	private String desg;
	private String dept;
	private static final long serialVersionUID=1L;
	
	public void addEmployeeDetails(int eno,String ename,int sal,String desg,String dept)
	{
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;
		this.desg=desg;
		this.dept=dept;
		
	}
	public void showInfo()
	{
		System.out.println(eno+","+ename+","+sal+","+desg+","+dept);
	}
	

}
