import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Rocketship extends GameObject{
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;	
	
	public Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		this.Speed = 10;
		if (needImage) {
		    loadImage ("rocket.png");
		}
		
	}
	public void Draw (Graphics G) {
		if (gotImage) {
			G.drawImage(image, x, y, width, height, null);
		} else {
			G.setColor(Color.BLUE);
			G.fillRect(x, y, width, height);
		}
	}
	public void update() {
		super.update();
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
	public Projectile getProjectile() {
        return new Projectile(x+width/2, y, 10, 10);
} 

}
