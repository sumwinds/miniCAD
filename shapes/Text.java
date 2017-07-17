package shapes;

import java.awt.Graphics;
import java.awt.Font;


public class Text extends Shape {
	private String text = "";
	private int xPos = 50;
	private int yPos = 50;
	private int size = 25;
	private Font font = new Font(text, Font.PLAIN, size);
	
	public Text() {}
	public Text(String text) {
		this.text = text;
	}
	public Text(int X, int Y, String text) {
		this.xPos = X;
		this.yPos = Y;
		this.text = text;
	}
	public Text(int X, int Y, String text, int size) {
		this.xPos = X;
		this.yPos = Y;
		this.text = text;
		this.size = size;
		font = new Font(text, Font.PLAIN, size);
	}

	public void setFont(int size) {
		font = new Font(text, Font.PLAIN, size);
	}
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getX() {
		return xPos;
	}
	public void setX(int xPos) {
		this.xPos = xPos;
	}
	public int getY() {
		return yPos;
	}
	public void setY(int yPos) {
		this.yPos = yPos;
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(color);
		g.setFont(font);
		g.drawString(text, xPos, yPos);
	}
	
}
