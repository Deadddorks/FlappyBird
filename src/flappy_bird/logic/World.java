package flappy_bird.logic;

// ---------- Imports ----------

// ---------- ------- ----------

public class World
{
	
	// ---------- Constants ----------
	private final double gravity = 10;
	private final double scrollingSpeed = 10;
	// ---------- --------- ----------
	// ---------- Variables ----------
	private final double screenWidth;
	private final double screenHieght;
	private final double pipeWidth;
	private ArrayList<Integer> pipes = new ArrayList<>();


	// ---------- --------- ----------
	
	public World(final double screenWidth, final double screenHieght, final double pipeWidth)
	{
		this.screenWidth = screenWidth;
		this.screenHieght = screenHieght;
		this.pipeWidth = pipeWidth;
	}

	public void generatePipes()
	{

	}

}
