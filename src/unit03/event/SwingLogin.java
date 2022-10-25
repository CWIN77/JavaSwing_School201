package unit03.event;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingLogin extends JFrame implements ActionListener {	
	JPanel topPanel = new JPanel();
	JPanel centerPanel = new JPanel();
	JPanel bottomPanel = new JPanel();
	
	JButton btnLogin = new JButton("로그인");
	JButton btnCancle = new JButton(" 취소");
	
	JLabel lbId = new JLabel("아이디", JLabel.CENTER);
	JLabel lbPwd = new JLabel("비밀번호", JLabel.CENTER);
	JLabel lbResult = new JLabel("결과출력",JLabel.LEFT);
	JTextField tfId = new JTextField();
	JPasswordField tfPwd = new JPasswordField();
	
	SwingLogin(){
		setLayout(new BorderLayout());
		ImageIcon image = new ImageIcon("images/robot.png");
		JLabel lbLogo = new JLabel(image);
		add(lbLogo,BorderLayout.NORTH);
		setTitle("로그인");
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
				lbResult.setText("아이디를 입력하세요.");
			}else if(strPwd.length() == 0) {
				lbResult.setText("비밀번호를 입력하세요.");
			}else {
				lbResult.setText(strId + "의 비밀번호는" + strPwd);
			}
		}else if(e.getSource() == btnCancle) {
			lbResult.setText("취소하였습니다.");
			tfId.setText("취소하였습니다.");
			tfPwd.setText("");
		}
	}
	public static void main(String[] args) {
		
		new SwingLogin();
		
	}
}
