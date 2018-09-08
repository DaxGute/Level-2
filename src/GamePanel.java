import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer time;
	GameObject gameObject;
	public GamePanel () {
		time = new Timer(1000/60, this);
		gameObject = new GameObject(90, 90, 6, 6);
		
	}
	public void actionPerformed(ActionEvent e) {
		repaint();
		gameObject.update();
	}
	
	public void startGame() {
		time.start();
	}
	@Override

	public void paintComponent(Graphics g){
		gameObject.draw(g);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("type");
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("press");
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("release");
		
	}
	
	
}
