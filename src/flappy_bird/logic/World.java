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
	
	public World(final double screenWidth, final double screenHeight, final double pipeWidth)
	{
		this.screenWidth = screenWidth;
		this.screenHeight = screenHeight;
		this.pipeWidth = pipeWidth;
	}

	public void generatePipes()
	{

	}

}
