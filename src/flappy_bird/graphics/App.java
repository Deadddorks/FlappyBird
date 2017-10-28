package flappy_bird.graphics;

// ---------- Imports ----------
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
// ---------- ------- ----------

public class App extends Application
{
	
	// ---------- Constants ----------
	private final int WIDTH = 1500;
	private final int HEIGHT = 840;
	// ---------- --------- ----------
	// ---------- Variables ----------
	private Scene scene;
	private Canvas canvas;
	
	private Graphics graphics;
	// ---------- --------- ----------
	
	@Override
	public void start(Stage window) throws Exception
	{
		
		canvas = new Canvas(WIDTH, HEIGHT);
		VBox box = new VBox();
		box.getChildren().add(canvas);
		
		graphics = new Graphics(canvas);
		graphics.draw();
		
		scene = new Scene(box);
		window.setScene(scene);
		window.setTitle("Flappy Bird");
		window.getIcons().add(new Image("resources/bird_up.png"));
		window.setResizable(false);
		window.sizeToScene();
		window.show();
		
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}
	
}
