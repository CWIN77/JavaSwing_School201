package unit03.event;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LabelButtonEx extends JFrame implements ActionListener {
	JPanel p = new JPanel();
	
	LabelButtonEx(){
		add(p);
		
		JLabel lb = new JLabel("제임스 고슬링 입니더!");
		p.add(lb);
		ImageIcon img = new ImageIcon("images/gosling.jpg");
		JLabel lbImage = new JLabel(img);
		p.add(lbImage);
		
		ImageIcon normalImg = new ImageIcon("images/normalIcon.gif");
		ImageIcon rolloverImg = new ImageIcon("images/rolloverIcon.gif");
		ImageIcon pressedImg = new ImageIcon("images/pressedIcon.gif");
		
		JButton normalBtn = new JButton("call~",normalImg);
		normalBtn.setPressedIcon(pressedImg);
		normalBtn.setRolloverIcon(pressedImg);
		p.add(normalBtn);
		//p.add(rolloverBtn);
		//p.add(pressedBtn);
		
		setTitle("배경색바꾸기");
		setSize(300,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	public static void main(String[] args) {
		
		new LabelButtonEx();
		
	}

}
