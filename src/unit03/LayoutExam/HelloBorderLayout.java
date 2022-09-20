package unit03.LayoutExam;

import java.awt.*;
import javax.swing.*;

public class HelloBorderLayout extends JFrame {

	HelloBorderLayout(){
		JPanel p = new JPanel();
		add(p);
		p.setLayout(new BorderLayout());
		for(int i = 0; i < 5; i++) {
			JButton btn = new JButton("버튼"+(i+1));
			if(i == 0) {
				p.add(btn,BorderLayout.NORTH);
			}else if(i == 1) {
				p.add(btn,BorderLayout.CENTER);
			}else if(i == 2) {
				p.add(btn,BorderLayout.WEST);
			}else {
				p.add(btn);
			}
		}
		setTitle("보더 레이아웃");
		setSize(350,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {

		new HelloBorderLayout();
		
	}

}
