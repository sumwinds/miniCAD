package field;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class View extends JPanel {
	
	private static final long serialVersionUID = -2417015700213488315L;
	private static final int GRID_SIZE = 16;
	private Picture pic;
	
	public View(Picture pic) {
		this.pic = pic;
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(pic.getWidth()+1, pic.getHeight()+1);
	}
	
}
