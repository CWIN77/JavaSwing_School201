package unit03.LayoutExam;
import javax.swing.*;
import java.awt.Color;

public class HelloPanel extends JFrame {
	HelloPanel(){
		setTitle("¾È³ç ½ºÀ®");
		setSize(500,400);
		setLocation(500,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		JPanel p = new JPanel();
		p.setBackground(Color.orange);
		add(p);
		
		JButton btn1 = new JButton("¹öÆ°1");
		btn1.setBackground(Color.yellow);
		
		JButton btn2 = new JButton("¹öÆ°2");
		btn2.setBackground(Color.pink);
		p.add(btn1);
		p.add(btn2);
	}
	public static void main(String[] args) {
		
		new HelloPanel();

	}

}
