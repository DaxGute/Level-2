import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject{

	public Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		this.Speed = 10;
		
	}
	public void Draw (Graphics G) {
		G.setColor(Color.BLUE);
        G.fillRect(x, y, width, height);
	}
	public void UP () {
		y -= Speed;
	}
	public void DOWN () {
		y += Speed;
	}
	public void RIGHT () {
		x += Speed;
	}
	public void LEFT () {
		x -= Speed;
	}

}
