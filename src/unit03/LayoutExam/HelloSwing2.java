package unit03.LayoutExam;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloSwing2 extends JFrame {
	
	HelloSwing2(){
		JFrame f = new JFrame();
		//JPanel p = new JPanel();
		//JButton b1 = new JButton("CLICK");
		//b1.setBounds(100, 100, 100, 40);
		//f.add(b1);
		
		f.setTitle("¾È³ç ½ºÀ®");
		f.setSize(500,400);
		f.setLocation(500,200);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		
		new HelloSwing2();

	}

}
