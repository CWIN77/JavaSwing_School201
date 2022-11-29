package exam;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class SwingExam1 extends JFrame implements ItemListener, ActionListener {
	
	JLabel lb = new JLabel("������2000��,����3000��,�500��",JLabel.CENTER);
	
	JCheckBox menu1 = new JCheckBox("������");
	JCheckBox menu2 = new JCheckBox("����");
	JCheckBox menu3 = new JCheckBox("�");
	
	JLabel lb_result = new JLabel("���� 0���Դϴ�.",JLabel.CENTER);
	
	JRadioButton pay1 = new JRadioButton("����");
	JRadioButton pay2 = new JRadioButton("ī��");
	
	ButtonGroup bg = new ButtonGroup();
	
	JButton btn1 = new JButton("����");
	JButton btn2 = new JButton("����");
	
	int sum = 0;
	
	SwingExam1(){
		
		setLayout(new GridLayout(0,1));
		
		add(lb);
		
		JPanel p1 = new JPanel();
		add(p1);
		p1.add(menu1);
		p1.add(menu2);
		p1.add(menu3);
		
		add(lb_result);
		
		JPanel p2 = new JPanel();
		add(p2);
		bg.add(pay1);
		bg.add(pay2);
		p2.add(pay1);
		p2.add(pay2);
		
		JPanel p3 = new JPanel();
		add(p3);
		p3.add(btn1);
		p3.add(btn2);
		
		menu1.addItemListener(this);
		menu2.addItemListener(this);
		menu3.addItemListener(this);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		setTitle("������1");
	    setSize(250,250);
	    setLocationRelativeTo(null);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new SwingExam1();
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			if(e.getItem() == menu1) {
				sum += 2000;
			}else if(e.getItem() == menu2) {
				sum += 3000;
			}else if(e.getItem() == menu3) {
				sum += 500;
			}
		}else if(e.getStateChange() == ItemEvent.DESELECTED) {
			if(e.getItem() == menu1) {
				sum -= 2000;
			}else if(e.getItem() == menu2) {
				sum -= 3000;
			}else if(e.getItem() == menu3) {
				sum -= 500;
			}
		}
		lb_result.setText("���� "+sum+"�� �Դϴ�.");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn1) {
			if(pay1.isSelected()) {
				JOptionPane.showMessageDialog(null, "�������� "+sum+"�� �����մϴ�.");
			}else if(pay2.isSelected()) {
				JOptionPane.showMessageDialog(null, "ī���"+sum+"�� �����մϴ�.");
			}else {
				JOptionPane.showMessageDialog(null, "���������� �������ּ���.");
			}
		}else if(e.getSource() == btn2) {
			System.exit(0);
		}
	}

}
