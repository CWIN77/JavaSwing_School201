package unit03.LayoutExam;

import javax.swing.*;
import java.awt.*;

public class HelloFlowLayout extends JFrame {
	HelloFlowLayout(){
		setTitle("¾È³ç ½ºÀ®");
		setSize(500,400);
		setLocation(500,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		JPanel p = new JPanel();
		p.setBackground(Color.orange);
		add(p);
		p.setLayout(new FlowLayout());
		
		for(int i = 0; i < 7; i++) {
			JButton btn = new JButton("¹öÆ°" + (i+1));
			btn.setBackground(Color.yellow);
			p.add(btn);
		}
	
	}
	public static void main(String[] args) {
		
		new HelloFlowLayout();

	}

}
