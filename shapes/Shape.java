package shapes;

import java.awt.Graphics;

public abstract class Shape {
	
	private String color = "white";
	private boolean filled = false;
	
	protected Shape() {}
	
	protected Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
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
