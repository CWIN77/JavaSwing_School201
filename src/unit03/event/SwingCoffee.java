package unit03.event;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingCoffee extends JFrame implements ItemListener {
    // 선언은 전부 맴버변수로 선언
    JRadioButton aRBtn = new JRadioButton("아메리카노");
    JRadioButton bRBtn = new JRadioButton("라떼");
    JRadioButton cRBtn = new JRadioButton("카푸치노");
    ButtonGroup buttonGroup = new ButtonGroup();
    JTextArea ta = new JTextArea("",7,20);
    JScrollPane sp = new JScrollPane(ta);

    SwingCoffee(){
        defaultSetting();
        eventManager();
        panelManger();
    }
    public void defaultSetting() {
        setTitle("커피주문");
        setSize(500,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new BorderLayout());
    }
    public void eventManager() {
        aRBtn.addItemListener(this);
        bRBtn.addItemListener(this);
        cRBtn.addItemListener(this);
    }
    public void panelManger() {
        JPanel panel = new JPanel();

        buttonGroup.add(aRBtn);
        buttonGroup.add(bRBtn);
        buttonGroup.add(cRBtn);

        panel.add(aRBtn);
        panel.add(bRBtn);
        panel.add(cRBtn);
        add(sp,BorderLayout.CENTER);
        add(panel,BorderLayout.NORTH);
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getStateChange() == ItemEvent.SELECTED){
            ta.append(((AbstractButton)e.getItem()).getText() + "가 선택되었습니다.\n");
        }else if(e.getStateChange() == ItemEvent.DESELECTED){
            ta.append(((AbstractButton)e.getItem()).getText() + "가 해제되었습니다.\n");
        }
    }
    public static void main(String[] args) {

        new SwingCoffee();

    }
}
