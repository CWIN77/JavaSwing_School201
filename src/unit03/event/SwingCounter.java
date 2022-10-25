package unit03.event;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingCounter extends JFrame implements ActionListener {	
	JLabel lb = new JLabel("ī���Ͱ�");
	JTextField tf = new JTextField("0",5);
	JButton btnInc = new JButton("����");
	JButton btnDec = new JButton("����");
	JButton btnCls = new JButton("�ʱ�ȭ");
	
	SwingCounter(){
		btnInc.addActionListener(this);
		btnDec.addActionListener(this);
		btnCls.addActionListener(this);
		
		JPanel p = new JPanel();
		add(p);
		p.add(lb);
		p.add(tf);
		p.add(btnInc);
		p.add(btnDec);
		p.add(btnCls);
		
		setTitle("����ī����");
		setSize(400,150);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnInc) {
			tf.setText((Integer.parseInt(tf.getText()) + 1)+"");
		}else if (e.getSource() == btnDec) {
			tf.setText((Integer.parseInt(tf.getText()) - 1)+"");
		}else if (e.getSource() == btnCls) {
			tf.setText("0");
		}
	}
	public static void main(String[] args) {
		
		new SwingCounter();
		
	}

}
