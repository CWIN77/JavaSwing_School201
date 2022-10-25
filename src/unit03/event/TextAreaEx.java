package unit03.event;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class TextAreaEx extends JFrame implements ActionListener {
	// 선언은 전부 맴버변수로 선언
	JLabel lb = new JLabel("입력 후 <Enter>키를 입력하세요");
	JTextArea ta = new JTextArea("안녕하세요",7,20);
	JScrollPane sp = new JScrollPane(ta);
	JTextField tf = new JTextField(20);
	
	TextAreaEx(){
		defaultSetting();
		eventManager();
		panelManger();
	}
	public void defaultSetting() {
		setTitle("텍스트영역만들기");
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
