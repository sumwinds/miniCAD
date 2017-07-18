package miniCAD;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToolBar;
import javax.swing.border.BevelBorder;

import field.Picture;
import field.View;

public class MiniCAD {

	private ObjectInputStream input;
	private ObjectOutputStream output;
	private Picture thePic;
	private View theView;
	private JFrame frame;
	private ArrayList<String> JPG = new ArrayList<String>();
	protected Color color = Color.BLACK;
	
	public void addJPG() {
		JPG.add("C:\\Users\\Admin\\Desktop\\homework\\circle.png");
		JPG.add("C:\\Users\\Admin\\Desktop\\homework\\line.png");
		JPG.add("C:\\Users\\Admin\\Desktop\\homework\\rectangle.png");
		JPG.add("C:\\Users\\Admin\\Desktop\\homework\\text.png");
	}
	
	public MiniCAD() {
		thePic = new Picture();
		theView = new View(thePic);
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setTitle("MiniCAD");
		
//		创建画板及画布
		JPanel jp = new JPanel();
        jp.setLayout(new FlowLayout(0));
        jp.setPreferredSize(new Dimension(600,600));
        frame.add(jp);
		jp.add(theView);
		theView.setBackground(Color.WHITE);
		
//		创建右侧面板
		JPanel panel = new JPanel();
		Dimension dime1 = new Dimension(130,600);
		panel.setPreferredSize(dime1);
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
//		设置边框效果
		panel.setBorder(new BevelBorder(0, Color.BLUE, new Color(205, 205, 205)));
		frame.add(panel, BorderLayout.EAST);
		
//		创建工具按钮
		addJPG();
		ButtonGroup buttons = new ButtonGroup();
		for(int i=0; i<4; i++) {
			JRadioButton rButton = new JRadioButton();
			
			rButton.setActionCommand(i+"形状");
			buttons.add(rButton);
			ImageIcon image1 = new ImageIcon(JPG.get(i));
			ImageIcon image2 = new ImageIcon(JPG.get(i));
			ImageIcon image3 = new ImageIcon(JPG.get(i));
			ImageIcon image4 = new ImageIcon(JPG.get(i));
			rButton.setIcon(image1);
			rButton.setRolloverIcon(image2);
			rButton.setPressedIcon(image3);
			rButton.setSelectedIcon(image4);
			panel.add(rButton);
			frame.add(panel, BorderLayout.EAST);
		}
		
//		创建选择颜色面板
		JPanel colorPanel = new JPanel();
		colorPanel.setPreferredSize(new Dimension(700,83));
		colorPanel.setBackground(Color.GREEN);
		colorPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		panel.add(colorPanel);
		frame.add(panel, BorderLayout.EAST);
		
//		创建颜色按钮
		ColorListener colors = new ColorListener(this);
		Random random = new Random();
		for(int i=0; i<16; i++) {
			JButton colorButton = new JButton();
			colorButton.setPreferredSize(new Dimension(20,20));
			colorButton.setBackground(new Color(random.nextInt(24532022)));;
			colorButton.addActionListener(colors);
			colorPanel.add(colorButton);
		}
		
		frame.pack();
		frame.setVisible(true);

	}
	
	public static void main(String[] args) {
		MiniCAD cad = new MiniCAD();
	}

}
