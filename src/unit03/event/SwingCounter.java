package unit03.event;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingCounter extends JFrame implements ActionListener {	
	JLabel lb = new JLabel("카운터값");
	JTextField tf = new JTextField("0",5);
	JButton btnInc = new JButton("증가");
	JButton btnDec = new JButton("감소");
	JButton btnCls = new JButton("초기화");
	
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
		
		setTitle("간단카운터");
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
