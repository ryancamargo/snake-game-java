import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GameFrame extends JFrame{

	ImageIcon image = new ImageIcon("snake.png");
	
	GameFrame(){
		
		this.add(new GamePanel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setIconImage(image.getImage());
	}
}
