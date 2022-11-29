
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class SwingExam1 extends JFrame implements ItemListener, ActionListener  {

	//�����ϰ��� �ϴ� �����̳ʿ� ������Ʈ ��ü �����ϱ�
	JCheckBox menu1 = new JCheckBox("������");
	JCheckBox menu2 = new JCheckBox("����");
	JCheckBox menu3 = new JCheckBox("�");
	
	JLabel lb_result = new JLabel("���� 0�� �Դϴ�.");
	
	JRadioButton pay1 = new JRadioButton("����");
	JRadioButton pay2 = new JRadioButton("ī��");
	
	ButtonGroup bg = new ButtonGroup();
	
	JButton btn1 = new JButton("����");
	JButton btn2 = new JButton("����");
	
	int sum = 0;
	
	public SwingExam1() {
		
		setLayout(new GridLayout(0,1));
		
		JLabel lb = new JLabel("������2000��,����3000��,�500��", JLabel.CENTER);
		this.add(lb);
		
		JPanel p1 = new JPanel();
		this.add(p1);
		p1.add(menu1);
		p1.add(menu2);
		p1.add(menu3);
		
		this.add(lb_result);
		
		//�޴��� ���� �̺�Ʈ �ޱ�
		menu1.addItemListener(this);
		menu2.addItemListener(this);
		menu3.addItemListener(this);
		
		
		JPanel p2 = new JPanel();
		this.add(p2);
		
		// ������ư �׷� �����, ȭ�鿡 ���̱�
		bg.add(pay1);
		bg.add(pay2);
		p2.add(pay1);
		p2.add(pay2);

		
		JPanel p3 = new JPanel();
		this.add(p3);
		
		p3.add(btn1);
		p3.add(btn2);
		
		//��ư�� ���� �̺�Ʈ �ޱ�
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		
		setTitle("������1");
		setSize(250, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new SwingExam1();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource() == menu1) {
			sum += (menu1.isSelected() ? 1 : -1) * 2000;
		}else if(e.getSource() == menu2) {
			sum += (menu2.isSelected() ? 1 : -1) * 3000;
		}else if(e.getSource() == menu3) {
			sum += (menu3.isSelected() ? 1 : -1) * 500;
		}
		lb_result.setText("���� "+sum+"���Դϴ�.");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn1) {
			if(btn1.isSelected()) {
				JOptionPane.showMessageDialog(null, "�������� "+sum+"�� �����մϴ�.");
			}else {
				JOptionPane.showMessageDialog(null, "ī��� "+sum+"�� �����մϴ�.");
			}
		}else {
			System.exit(0);
		}
	}

}