package shapes;

import field.Picture;

public class MyPic {
	public static void main(String[] args) 
	{
		Picture pic = new Picture(420,300);
		Text t1 = new Text(50, 50, "Äàº¿", 28);
		Text t2 = new Text(100, 50, "ÐãµÄÒ»Åú", 20);
		pic.add(t1);
		pic.add(t2);
		pic.draw();	
	}
}
