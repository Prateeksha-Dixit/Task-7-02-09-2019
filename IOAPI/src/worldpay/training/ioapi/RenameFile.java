package worldpay.training.ioapi;
import java.util.*;
import java.io.File;


public class RenameFile {

	public static void main(String[] args) {
		
		System.out.println("Enter two file names: ");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		Boolean flag=true;
		
		File file1=new File("P:/"+s1);
		File file2=new File("P:/"+s2);
		try {
		file1.createNewFile();
		file2.createNewFile();
		sc.close();
		
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		
		if(file1.exists()==false)
		{
			System.out.println("file1 not found");
			flag=false;
		}
			
		if(!file1.isFile())
		{
			System.out.println("file1 is not file");
			flag=false;
		}
		if(file2.exists())
		{
			System.out.println("File "+s2+" already exists.");
			flag=false;
		}
		if((byte)file1.length()>500)
		{
			System.out.println("file is too long");
			flag=false;
		}
		
		if(flag==true) {
			if(file1.renameTo(file2));
			System.out.println("file "+s1+" is renamed to "+s2);
			
		}
		else
			System.out.println("File not renamed");
			
		
		
		
		
		

	}

}
