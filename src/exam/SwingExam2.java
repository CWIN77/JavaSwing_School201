package exam;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingExam2 extends JFrame implements KeyListener, MouseListener {
	JPanel p = new JPanel();
	String [] data = {"�����","�����","�ý��۰�","������Ű�"};
	JComboBox<String> combo = new JComboBox<String>(data);
	JTextField tf = new JTextField(10);
	JLabel lb_result = new JLabel("<Enter>Ű�� ������ �ҼӰ� �̸��� �����ݴϴ�.");
	
	SwingExam2(){
		add(p);
		
		JLabel lb1 = new JLabel("�а� : ");
		JLabel lb2 = new JLabel("�̸� : ");
		
		p.add(lb1);
		p.add(combo);
		p.add(lb2);
		p.add(tf);
		p.add(lb_result);
		
		tf.addKeyListener(this);
		p.addMouseListener(this);
		
		setTitle("������1");
	    setSize(250,250);
	    setLocationRelativeTo(null);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new SwingExam2();
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		String str = tf.getText().trim();
		int i = combo.getSelectedIndex();
		
		if(e.getKeyChar() == '\n' && str.length() > 0) {
			lb_result.setText("����� " + data[i] + " " + str + "�Դϴ�.");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		int r = (int)(Math.random() * 256);
		int g = (int)(Math.random() * 256);
		int b = (int)(Math.random() * 256);
		
		p.setBackground(new Color(r,g,b));
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		int r = (int)(Math.random() * 256);
		int g = (int)(Math.random() * 256);
		int b = (int)(Math.random() * 256);
		
		p.setBackground(new Color(r,g,b));
		
	}

}
