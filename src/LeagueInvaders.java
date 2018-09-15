import java.awt.Dimension;

import javax.swing.JFrame;

public class LeagueInvaders {
	private JFrame frame;
	private final int WINDOW_X = 720;
	private final int WINDOW_Y = 480;
	private GamePanel panel;
	final static int WIDTH = 720;
	final static int HEIGHT = 480;

	public static void main(String[] args) {
		LeagueInvaders invaders = new LeagueInvaders();
		invaders.setup();

	}

	private void setup() {
		panel = new GamePanel();

		frame = new JFrame("League Invaders");
		frame.addKeyListener(panel);
		frame.add(panel);
		frame.setSize(WINDOW_X, WINDOW_Y);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		frame.getContentPane().setPreferredSize(new Dimension(WINDOW_X, WINDOW_Y));
		panel.startGame();

	}
}
