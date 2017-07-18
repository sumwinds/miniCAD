package shapes;

import java.awt.Graphics;

public class Rectangle extends Shape {

	private int x = 50;
	private int y = 50;
	private int width = 50;
	private int height = 50;
	
	public Rectangle() {}
	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillRect(x, y, width, height);
		g.drawRect(x, y, width, height);
	}
	@Override
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public void beBigger() {
		width++;
		height++;
	}
	@Override
	public void beNarrow() {
		width--;
		height--;
	}

}
