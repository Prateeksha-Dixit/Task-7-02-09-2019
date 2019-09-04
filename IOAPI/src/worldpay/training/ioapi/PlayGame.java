package worldpay.training.ioapi;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class PlayGame {

	public static void main(String[] args) throws Exception {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Mode 1 For New Game, 2 For Resuming Previous One : ");
		int ch=sc.nextInt();
		System.out.println("Horizontal Move : ");
		int x=sc.nextInt();
		System.out.println("Vertical Move : ");
		int y=sc.nextInt();
		System.out.println("Z Move : ");
		int z=sc.nextInt();
		
		ThreeDimGame tdg=null;
		
		if(ch==1)
		{
			tdg=new ThreeDimGame();
			
		}
		else {
			
			FileInputStream fis=new FileInputStream("P:/prevgame.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			tdg=(ThreeDimGame)ois.readObject();
		}
		
		tdg.moveH(x);tdg.moveV(y);tdg.moveZ(z);
		tdg.show();
		
		System.out.println("Saving Game Instance ..................");
		
		FileOutputStream fos=new FileOutputStream("P:/prevgame.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(tdg);
		oos.close(); fos.close();
		System.out.println("Closing Game .............");
		
		
		

	}

}
