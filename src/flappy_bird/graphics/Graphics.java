package flappy_bird.graphics;

// ---------- Imports ----------
import flappy_bird.logic.World;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
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
		
		drawPipesAtLoc(100, 400);
		
	}
	
	public World getWorld()
	{
		return world;
	}
	
	public void gameTick()
	{
		world.gameTick();
		draw();
	}
	
	public void drawPipesAtLoc(final double xOffset, final double yOffset)
	{
		graphicsContext.drawImage(new Image("resources/pipe_up.png"), xOffset, yOffset);
		graphicsContext.drawImage(new Image("resources/pipe_down.png"), xOffset, yOffset - PIPE_SEPARATION - canvas.getHeight());
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
