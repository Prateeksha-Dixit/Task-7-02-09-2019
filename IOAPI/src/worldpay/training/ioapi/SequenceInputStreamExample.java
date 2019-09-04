package worldpay.training.ioapi;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;


public class SequenceInputStreamExample  {

	public static void main(String[] args)throws Exception {
		FileInputStream fis1=new FileInputStream("P:/pd.txt");
		FileInputStream fis2=new FileInputStream("P:/mydata.txt");
		SequenceInputStream sis=new SequenceInputStream(fis1, fis2);
		FileOutputStream fos=new FileOutputStream("P:/sisoutput.txt");
		
		int ch;
		while((ch=sis.read())!=-1)
		{
			fos.write(ch);
		}
		sis.close();fis1.close();fis2.close();fos.close();
		System.out.println("Files merged Successfully");

	}

}
