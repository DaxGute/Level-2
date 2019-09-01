import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager implements ActionListener {
	private Rocketship Rocket;
	private ArrayList<Projectile> Projectile = new ArrayList();
	private ArrayList<Alien> Aliens = new ArrayList();
	Random random = new Random();
	public ObjectManager(Rocketship a) {
		Rocket = a;
	}
	public void addProjectile(Projectile a) {
		Projectile.add(a);
	}
	public void addAlien() {
		Aliens.add(new Alien(random.nextInt(LeagueInvaders.WIDTH),0,50,50));
	}
	public void update () {
		for (int i = 0; i < Aliens.size(); i++) {
			Aliens.get(i).update();
			if (Aliens.get(i).y > LeagueInvaders.HEIGHT) {
				Aliens.get(i).isActive = false;
			}
		}
		for (int i = 0; i < Projectile.size(); i++) {
			Projectile.get(i).update();
			if (Projectile.get(i).y > LeagueInvaders.HEIGHT) {
				Projectile.get(i).isActive = false;
			}
		}
	}
	public void Draw (Graphics e) {
		Rocket.Draw(e);
		for (int i = 0; i < Aliens.size(); i++) {
			Aliens.get(i).Draw(e);
		}
		for (int i = 0; i < Projectile.size(); i++) {
			Projectile.get(i).Draw(e);
		}
	}
	public void purgeObjects() {
		for (int i = 0; i < Aliens.size(); i++) {
			if (Aliens.get(i).isActive == false) {
				Aliens.remove(Aliens.get(i));
			}
		}
		for (int i = 0; i < Projectile.size(); i++) {
			if (Projectile.get(i).isActive == false) {
				Projectile.remove(Projectile.get(i));
			}
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
