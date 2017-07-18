package shapes;

import java.awt.Graphics;

public class Line extends Shape{

	private int startX = 50;
	private int startY = 50;
	private int endX = 100;
	private int endY = 100;
	private double length = Math.sqrt((endX-startX)*(endX-startX)+(endY-startY)*(endY-startY));
	
	public Line() {}
	public Line(int startX, int startY, int endX, int endY) {
		this.startX = startX;
		this.startY = startY;
		this.endX = endX;
		this.endY = endY;
		length = Math.sqrt((endX-startX)*(endX-startX)+(endY-startY)*(endY-startY));
	}
	
	@Override
	public String toString() {
		return ""+length;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(super.color);
		g.drawLine(startX, startY, endX, endY);
	}
	@Override
	public void move(int x, int y) {
		startX = x;
		startY = y;
	}
	@Override
	public void beBigger() {
		endX++;
		endY++;
	}
	@Override
	public void beNarrow() {
		endX--;
		endY--;
	}
	
}
