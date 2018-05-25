import javax.swing.*;

public class AlgoFrame extends JFrame {
	
	private int canvasWidth;
	private int canvasHeight;
	
	public AlgoFrame(String title) {
		this(title, 1024, 1024);
	}
	
	public AlgoFrame(String title, int canvasWidth, int canvasHeight) {
		super(title);
		this.canvasWidth = canvasWidth;
		this.canvasHeight = canvasHeight;
		
		setSize(canvasWidth, canvasHeight);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
	}
	
	public int getCanvasWidth() {
		return canvasWidth;
	}
	
	
	public int getCanvasHeight() {
		return canvasHeight;
	}
}
