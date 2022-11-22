package unit03.event;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class HelloKeyEvent2 extends JFrame implements ActionListener, KeyListener {
    JLabel lb = new JLabel("<Enter>키로 배경색이 바뀝니다.");
    JPanel panel = new JPanel();
    
    HelloKeyEvent2(){
        panelManger();
        eventManager();
        defaultSetting();
    }
    public void defaultSetting() {
        setTitle("키이벤트 예제");
        setSize(300,250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
        panel.setFocusable(true);
        panel.requestFocus();
        
    }
    public void eventManager() {
    	panel.addKeyListener(this);
        
    }
    public void panelManger() {
        panel.add(lb);

        add(panel);
    }

    public static void main(String[] args) {

        //System.out.println(images[0]);
        new HelloKeyEvent2();

    }
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		int r = (int)(Math.random() * 256);
		int g = (int)(Math.random() * 256);
		int b = (int)(Math.random() * 256);
		
		System.out.println("r");
		
		switch(e.getKeyChar()) {
		case '\n':
			panel.setBackground(new Color(r,g,b));
			break;
		case 'q':
			System.exit(0);
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

    
}