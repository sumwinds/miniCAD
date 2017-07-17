package shapes;

import java.awt.Graphics;

public class Circle extends Shape {

	private int centerX = 50;
	private int centerY = 50;
	private int radius = 10;
	
	public Circle() {}
	public Circle(int x, int y) {
		centerX = x;
		centerY = y;
	}
	public Circle(int x, int y, int radius) {
		centerX = x;
		centerY = y;
		this.radius = radius;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@Override
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillOval(centerX, centerY, radius, radius);
	}
	
}
