package flappy_bird.logic;

// ---------- Imports ----------
import java.util.ArrayList;
// ---------- ------- ----------

public class World
{
	
	// ---------- Constants ----------
	private final double gravity = 10;
	private final double scrollingSpeed = 10;
	// ---------- --------- ----------
	// ---------- Variables ----------
	private final double screenWidth;
	private final double screenHeight;
	private final double pipeWidth;
	private ArrayList<Integer> pipes = new ArrayList<>();


	// ---------- --------- ----------
	
	public World(final double screenWidth, final double screenHeight, final double pipeWidth, final double pipeSeperation) // Need to add this variable
	{
		this.screenWidth = screenWidth;
		this.screenHeight = screenHeight;
		this.pipeWidth = pipeWidth;
	}

	public void generatePipes()
	{

	}
	
	public void jump()
	{
	
	}
	
	public ArrayList<Integer> getPipes()
	{
		return pipes;
	}
	
	public double getPlayerHeight()
	{
		return 0;
	}
	public boolean goingDown()
	{
		return false;
	}
	
	public void restart()
	{
	
	}

}
