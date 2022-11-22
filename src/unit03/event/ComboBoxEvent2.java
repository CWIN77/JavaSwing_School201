package unit03.event;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ComboBoxEvent2 extends JFrame implements ActionListener {
    String [] coffee = {"아메리카노","라떼","카푸치노","에스프레소"};
    JComboBox<String> combo = new JComboBox<String>(coffee);
    ImageIcon [] images = {
            new ImageIcon("images/ame.jpg"),
            new ImageIcon("images/latte.jpg"),
            new ImageIcon("images/capu.jpg"),
            new ImageIcon("images/es.jpg")
    };
    JLabel lb = new JLabel(images[0]);

    ComboBoxEvent2(){
        panelManger();
        eventManager();

        defaultSetting();
    }
    public void defaultSetting() {
        setTitle("텍스트영역만들기");
        setSize(400,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void eventManager() {
        combo.addActionListener(this);
    }
    public void panelManger() {
        JPanel panel = new JPanel();

        add(combo,BorderLayout.NORTH);
        add(lb,BorderLayout.CENTER);


        // add(panel);
    }

    public static void main(String[] args) {

        //System.out.println(images[0]);
        new ComboBoxEvent2();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.print(combo.getSelectedIndex());

        int index =  combo.getSelectedIndex();
        lb.setIcon(images[index]);
    }
}