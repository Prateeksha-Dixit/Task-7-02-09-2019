package worldpay.training.ioapi;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) {
		try {
			File inputfile=new File("P:/inputFile.txt");
			File outputfile=new File("P:/outputFile.txt");
			inputfile.createNewFile();
			outputfile.createNewFile();
			
			
			FileInputStream inputstream=new FileInputStream(inputfile);
			FileOutputStream outputstream=new FileOutputStream(outputfile);
			
			byte[] buffer=new byte[1024];
			int length;
			
			while((length=inputstream.read(buffer))>0)
				outputstream.write(buffer, 0, length);
			
			inputstream.close();
			outputstream.close();
			
			System.out.println("File copied successfully");
			
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
