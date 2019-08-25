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
	private final int MENU_STATE = 0;
	private final int GAME_STATE = 1;
	private final int END_STATE = 2;
	private int current_state = MENU_STATE;
	private Font titleFont;
	private Font textFont;
	private Timer frameDraw;
	private Rocketship Rocket;

	public GamePanel() {
		frameDraw = new Timer(1000 / 60, this);
		frameDraw.start();
		titleFont = new Font("Ariel", Font.PLAIN, 48);
		textFont = new Font("Ariel", Font.PLAIN, 19);
		Rocket = new Rocketship(250, 700, 50, 50);
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
		frameDraw.start();
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
			} else{
				current_state++;	
			}
		if (e.getKeyCode()==KeyEvent.VK_UP) {
		    System.out.println("UP");
		    //if (y==0)
		}
		if (e.getKeyCode()==KeyEvent.VK_DOWN) {
		    System.out.println("DOWN");
		}
		if (e.getKeyCode()==KeyEvent.VK_LEFT) {
		    System.out.println("LEFT");
		}
		if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
		    System.out.println("RIGHT");
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
		G.setColor(Color.YELLOW);
		G.drawString("LEAGUE INVADERS", 40, 100);
		G.setFont(textFont);
		G.drawString("Press ENTER to Start", 150, 300);
		G.drawString("Press SPACE for Instructions", 125, 500);
	}

	public void drawGameState(Graphics G) {
		G.setColor(Color.BLACK);
		G.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		Rocket.Draw(G);
	}

	public void drawEndState(Graphics G) {
		G.setColor(Color.RED);
		G.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		G.setFont(titleFont);
		G.setColor(Color.YELLOW);
		G.drawString("GAME OVER", 100, 100);
		G.setFont(textFont);
		G.drawString("You killed " + " Enemies", 150, 300);
		G.drawString("Press ENTER to Restart", 125, 500);
	}

}
