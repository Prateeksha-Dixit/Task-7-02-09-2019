package worldpay.training.ioapi;

public class ThreeDimGame extends Game {
	
	private int zPos;
	
	public void moveZ(int z)
	{
		zPos+=z;
	}
	public void show()
	{
		super.showPos();
		System.out.println(","+zPos);
	}

}
