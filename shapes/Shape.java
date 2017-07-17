package shapes;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {
	
	protected Color color = Color.BLACK;
	protected boolean filled = false;
	
	protected Shape() {}
	
	protected Shape(Color color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public boolean idFilled() {
		return filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	@Override
	public String toString() {
		return "color " + color + "and filled: " + filled;
	}
	
	public abstract void draw(Graphics g);
}
