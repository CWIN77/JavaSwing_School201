import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class SwingExam2 extends JFrame {


	//�����ϰ��� �ϴ� �����̳ʿ� ������Ʈ ��ü �����ϱ�
	JPanel p = new JPanel();
	
	
	
	
	

	
	public SwingExam2() {
		
		add(p);
		
		JLabel lb1 = new JLabel("�а� : ");
		JLabel lb2 = new JLabel("�̸� : ");
		
		p.add(lb1);
		p.add(combo);
		p.add(lb2);
		p.add(tf);
		p.add(lb_result);
		
		//�̺�Ʈ �ޱ�
		
		
		
		setTitle("������2");
		setSize(400, 150);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new SwingExam2();
	}

}
