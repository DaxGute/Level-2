import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener {
	Timer time;
	public GamePanel () {
		time = new Timer(1000, this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("hi");
	}
	public void startGame() {
		time.start();
	}
}
