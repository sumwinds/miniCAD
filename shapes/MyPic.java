package shapes;

public class MyPic {
	public static void main(String[] args) 
	{
		Picture pic = new Picture(420,300);
		Text t1 = new Text(50, 50, "�຿");
		Text t2 = new Text(100, 50, "���һ��");
		pic.add(t1);
		pic.add(t2);
		pic.draw();	
	}
}
