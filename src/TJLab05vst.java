import java.applet.Applet;
import java.awt.Graphics;


public class TJLab05vst extends Applet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void paint(Graphics g) {
		int width = 1260;
		int height = 700;
		
		g.drawRect(10, 10, width, height);
		
		int x1 = 0;
		
		for (int k = 1; k < 50; k++) {
			g.drawLine(10, height, width, x1);
			x1 = (height / k);
		}
		
		
	}
}