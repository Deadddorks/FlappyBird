package flappy_bird.graphics;

// ---------- Imports ----------
import flappy_bird.logic.World;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
// ---------- ------- ----------

public class Graphics
{
	
	// ---------- Constants ----------
	private final double PIPE_WIDTH = 25;
	private final double PIPE_SEPARATION = 150;
	private final int fps = 20;
	// ---------- --------- ----------
	// ---------- Variables ----------
	private Canvas canvas;
	private GraphicsContext graphicsContext;
	
	private World world;
	private boolean gameRunning;
	// ---------- --------- ----------
	
	public Graphics(final Canvas canvas)
	{
		this.canvas = canvas;
		this.graphicsContext = canvas.getGraphicsContext2D();
		
		gameRunning = false;
		world = new World(canvas.getWidth(), canvas.getHeight(), PIPE_WIDTH, PIPE_SEPARATION);
	}
	
	public void draw()
	{
		Image background = new Image("resources/background.png");
		
		graphicsContext.drawImage(background, 0, 0, canvas.getWidth(), canvas.getHeight());
	}
	
	public World getWorld()
	{
		return world;
	}
	
	public void gameTick()
	{
		System.out.println("Game Tick");
	}
	
	public void newGame()
	{
		world.restart();
		
		gameRunning = true;
	}
	public void end()
	{
		gameRunning = false;
	}
	
	public boolean isGameRunning()
	{
		return gameRunning;
	}
	
	public int getFpsDelay()
	{
		return 1000 / fps;
	}
	
}
