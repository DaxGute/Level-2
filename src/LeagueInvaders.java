import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame frame;
	final int WINDOW_X = 720;
	final int WINDOW_Y = 480;
	public static void main(String[] args) {
		LeagueInvaders invaders = new LeagueInvaders();
		invaders.setup();
	}
	private  void setup() {
		frame = new JFrame("League Invaders");
		frame.setSize(WINDOW_X, WINDOW_Y);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
