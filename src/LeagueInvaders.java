import java.awt.Dimension;

import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame frame;
	final int WINDOW_X = 720;
	final int WINDOW_Y = 480;
	GamePanel panel;
	public static void main(String[] args) {
		LeagueInvaders invaders = new LeagueInvaders();
		invaders.setup();
	
	}
	private  void setup() {
		panel = new GamePanel();
		
		frame = new JFrame("League Invaders");
		frame.add(panel);
		frame.setSize(WINDOW_X, WINDOW_Y);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		frame.getContentPane().setPreferredSize(new Dimension(WINDOW_X, WINDOW_Y));
		panel.startGame();

	}
}
