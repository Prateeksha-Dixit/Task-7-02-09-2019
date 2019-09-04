package worldpay.training.ioapi;
import java.io.Serializable;

public class Game implements Serializable {
	private int xPos;
	private int yPos;
	
	public void moveH(int x)
	{
		xPos+=x;
	}
	
	public void moveV(int y)
	{
		yPos+=y;
	}
	
	public void showPos() {
		System.out.print("CURRENT POS : "+xPos+","+yPos);
	}
	
	
}
