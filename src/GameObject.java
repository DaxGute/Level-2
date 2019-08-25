import java.awt.Graphics;

public class GameObject {
	int x;
	int y;
	int width;
	int height;
	int Speed;
	boolean isActive;

	public GameObject(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.Speed = 0;
		isActive = true;
	}

	public void update() {

	}

	public void draw(Graphics G) {
		G.fillRect(x, y, 100, 100);
	}
}
