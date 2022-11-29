import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class SwingExam2 extends JFrame {


	//구현하고자 하는 컨테이너와 컴포넌트 객체 선언하기
	JPanel p = new JPanel();
	
	
	
	
	

	
	public SwingExam2() {
		
		add(p);
		
		JLabel lb1 = new JLabel("학과 : ");
		JLabel lb2 = new JLabel("이름 : ");
		
		p.add(lb1);
		p.add(combo);
		p.add(lb2);
		p.add(tf);
		p.add(lb_result);
		
		//이벤트 달기
		
		
		
		setTitle("수행평가2");
		setSize(400, 150);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new SwingExam2();
	}

}
