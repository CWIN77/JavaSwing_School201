package unit03.event;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingLogin extends JFrame implements ActionListener {	
	JPanel topPanel = new JPanel();
	JPanel centerPanel = new JPanel();
	JPanel bottomPanel = new JPanel();
	
	JButton btnLogin = new JButton("�α���");
	JButton btnCancle = new JButton(" ���");
	
	JLabel lbId = new JLabel("���̵�", JLabel.CENTER);
	JLabel lbPwd = new JLabel("��й�ȣ", JLabel.CENTER);
	JLabel lbResult = new JLabel("������",JLabel.LEFT);
	JTextField tfId = new JTextField();
	JPasswordField tfPwd = new JPasswordField();
	
	SwingLogin(){
		setLayout(new BorderLayout());
		ImageIcon image = new ImageIcon("images/robot.png");
		JLabel lbLogo = new JLabel(image);
		add(lbLogo,BorderLayout.NORTH);
		setTitle("�α���");
		setSize(300,250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		centerPanel.setLayout(new GridLayout(0,2));
		bottomPanel.setLayout(new FlowLayout());
		
		centerPanel.add(btnLogin);
		centerPanel.add(btnCancle);
		centerPanel.add(lbId);
		centerPanel.add(lbPwd);
		centerPanel.add(lbResult);
		centerPanel.add(tfId);
		centerPanel.add(tfPwd);
		
		add(lbLogo, BorderLayout.NORTH);
		add(centerPanel, BorderLayout.CENTER);
		add(lbResult,BorderLayout.SOUTH);
		
		
		btnLogin.addActionListener(this);
		btnCancle.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnLogin) {
			String strId = tfId.getText();
			String strPwd = tfPwd.getPassword().toString();
			if(strId.length() == 0) {
				lbResult.setText("���̵� �Է��ϼ���.");
			}else if(strPwd.length() == 0) {
				lbResult.setText("��й�ȣ�� �Է��ϼ���.");
			}else {
				lbResult.setText(strId + "�� ��й�ȣ��" + strPwd);
			}
		}else if(e.getSource() == btnCancle) {
			lbResult.setText("����Ͽ����ϴ�.");
			tfId.setText("����Ͽ����ϴ�.");
			tfPwd.setText("");
		}
	}
	public static void main(String[] args) {
		
		new SwingLogin();
		
	}
}
