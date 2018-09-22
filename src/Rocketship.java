import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject{
	private int speed;
	public Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed = 5;
		
	}
	public void update() {

	}

	public void draw(Graphics g) {
		
		g.setColor(Color.BLUE);
        g.fillRect(x, y, width, height);
	}
	public void move_Left() {
		this.x += speed;
	}
	public void move_Right() {
		this.x -= speed;
	}

}
