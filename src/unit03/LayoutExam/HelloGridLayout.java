package unit03.LayoutExam;

import java.awt.GridLayout;

import javax.swing.*;

public class HelloGridLayout extends JFrame {

	HelloGridLayout(){
		JPanel p = new JPanel();
		add(p);
		for(int i = 0; i < 7; i++) {
			JButton btn = new JButton("버튼"+(i+1));
			p.add(btn);
		}
		p.setLayout(new GridLayout(0,2));
		setTitle("그리드 레이아웃");
		setSize(350,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {

		new HelloGridLayout();
		
	}

}
