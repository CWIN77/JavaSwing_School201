package unit03.event;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ComButton extends JFrame implements ActionListener {
	JPanel p = new JPanel();
	JButton btn1 = new JButton("노란색");
	JButton btn2 = new JButton("핑크색");
	ComButton(){
		add(p);
		p.setLayout(new FlowLayout());
		btn1.setBackground(Color.yellow);
		btn2.setBackground(Color.pink);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		p.add(btn1);
		p.add(btn2);
		setTitle("배경색바꾸기");
		setSize(700,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn1) {
			p.setBackground(Color.yellow);
		}else if (e.getSource() == btn2) {
			p.setBackground(Color.pink);
		}
	}
	public static void main(String[] args) {
		
		new ComButton();
		
	}

}
