package unit03.LayoutExam;
import java.awt.Color;

import javax.swing.*;

public class HelloButton extends JFrame {
	HelloButton(){
		setTitle("�ȳ� ����");
		setSize(500,400);
		setLocation(500,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		JPanel p = new JPanel();
		p.setBackground(Color.LIGHT_GRAY);
		add(p);
		
		
		
		JButton btn = new JButton("Ŭ��!");
		p.add(btn);
		
	}

	public static void main(String[] args) {
		new HelloButton();
		
	}

}
