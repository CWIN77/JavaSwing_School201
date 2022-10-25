package unit03.LayoutExam;

import javax.swing.JButton;
import javax.swing.JFrame;

public class HelloSwing extends JFrame {
	HelloSwing(){
		JButton b1 = new JButton("CLICK");
		b1.setBounds(100, 100, 100, 40);
		
		add(b1);
		setTitle("¾È³ç ½ºÀ®");
		setSize(1600,900);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new HelloSwing();
	}
}
