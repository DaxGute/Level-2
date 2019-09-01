import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Projectile extends GameObject{
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;	
	public Projectile(int x, int y, int width, int height) {
		super(x, y, width, height);
		this.Speed = 10;
		if (needImage) {
		    loadImage ("projectile.png");
		}
	}
	public void Draw (Graphics G) {
		if (gotImage) {
			G.drawImage(image, x, y, width, height, null);
		} else {
			G.setColor(Color.RED);
			G.fillRect(x, y, width, height);
		}
	}
	public void update() {
		this.y -= Speed;
		super.update();
	}
	
	void loadImage(String imageFile) {
	    if (needImage) {
	        try {
	            image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
		    gotImage = true;
	        } catch (Exception e) {
	            
	        }
	        needImage = false;
	    }
	}

}
