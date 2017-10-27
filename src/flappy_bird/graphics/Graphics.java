package flappy_bird.graphics;

// ---------- Imports ----------
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
// ---------- ------- ----------

public class Graphics
{
	
	// ---------- Constants ----------
	
	// ---------- --------- ----------
	// ---------- Variables ----------
	private Canvas canvas;
	private GraphicsContext graphicsContext;
	// ---------- --------- ----------
	
	public Graphics(final Canvas canvas)
	{
		this.canvas = canvas;
		this.graphicsContext = canvas.getGraphicsContext2D();
	}
	
	public void draw()
	{
		Image background = new Image("resources/background.png");
		
		graphicsContext.drawImage(background, 0, 0, canvas.getWidth(), canvas.getHeight());
	}
	
}
