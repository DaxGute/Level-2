import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame frame;
	final int WINDOWX = 720;
	final int WINDOWY = 480;
	public static void main(String[] args) {
		LeagueInvaders invaders = new LeagueInvaders();
		invaders.setup();
	}
	private  void setup() {
		frame = new JFrame("League Invaders");
		frame.setSize(WINDOWX, WINDOWY);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
