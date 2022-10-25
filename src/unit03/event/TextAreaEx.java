package unit03.event;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class TextAreaEx extends JFrame implements ActionListener {
	// ������ ���� �ɹ������� ����
	JLabel lb = new JLabel("�Է� �� <Enter>Ű�� �Է��ϼ���");
	JTextArea ta = new JTextArea("�ȳ��ϼ���",7,20);
	JScrollPane sp = new JScrollPane(ta);
	JTextField tf = new JTextField(20);
	
	TextAreaEx(){
		defaultSetting();
		eventManager();
		panelManger();
	}
	public void defaultSetting() {
		setTitle("�ؽ�Ʈ���������");
		setSize(300,250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void eventManager() {
		tf.addActionListener(this);
	}
	public void panelManger() {
		JPanel panel = new JPanel();
		
		panel.add(lb);
		panel.add(tf);
		panel.add(sp);
		
		add(panel);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == tf) {
			ta.append("\n" + tf.getText());
			tf.setText("");
		}
	}
	public static void main(String[] args) {
		
		new TextAreaEx();

	}

}
