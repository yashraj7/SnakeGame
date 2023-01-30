
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
	public GameFrame() {
		this.add(new GamePannel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
	

}
