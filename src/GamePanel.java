import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener {
	Timer time;
	public GamePanel () {
		time = new Timer(1000/60, this);
	}
	public void actionPerformed(ActionEvent e) {
	
		
	}
	public void startGame() {
		time.start();
	}
	@Override

	public void paintComponent(Graphics g){
		g.fillRect(10, 10, 100, 100);
	}
	
	
}
