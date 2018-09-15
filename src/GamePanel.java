import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	private Timer time;
	private final int MENU_STATE = 0;
	private final int GAME_STATE = 1;
	private final int END_STATE = 2;
	private int current_state = MENU_STATE;
	private Font titleFont;

	public GamePanel() {
		time = new Timer(1000 / 60, this);
		titleFont = new Font("Ariel", Font.PLAIN, 48);

	}

	public void actionPerformed(ActionEvent e) {
		if (current_state == MENU_STATE) {
			updateMenuState();
		} else if (current_state == GAME_STATE) {
			updateGameState();
		} else if (current_state == END_STATE) {
			updateEndState();
		}
		repaint();
	}

	public void startGame() {
		time.start();
	}

	@Override

	public void paintComponent(Graphics g) {
		if (current_state == MENU_STATE) {
			drawMenuState(g);
		} else if (current_state == GAME_STATE) {
			drawGameState(g);
		} else if (current_state == END_STATE) {
			drawEndState(g);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		System.out.println("type");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("press" + e.getKeyCode());
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			if (current_state == END_STATE) {
				current_state = MENU_STATE;
			} else if (current_state == MENU_STATE) {
				current_state = GAME_STATE;
			} else if (current_state == GAME_STATE) {
				current_state = END_STATE;
			}

		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("release");
	}

	public void updateMenuState() {

	}

	public void updateGameState() {

	}

	public void updateEndState() {

	}

	public void drawMenuState(Graphics G) {
		G.setColor(Color.BLUE);
		G.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		G.setFont(titleFont);
		G.drawString("Text", 40, 40);
	}

	public void drawGameState(Graphics G) {
		G.setColor(Color.BLACK);
		G.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
	}

	public void drawEndState(Graphics G) {
		G.setColor(Color.RED);
		G.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
	}

}
