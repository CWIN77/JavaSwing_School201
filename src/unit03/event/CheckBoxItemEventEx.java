package unit03.event;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckBoxItemEventEx extends JFrame implements ItemListener {
    // 선언은 전부 맴버변수로 선언
    JLabel lb = new JLabel("사과 : 100원, 배 : 500원, 체리 : 2000원");
    JCheckBox aCheckBox = new JCheckBox("사과");
    JCheckBox bCheckBox = new JCheckBox("배");
    JCheckBox cCheckBox = new JCheckBox("체리");
    JLabel lbResult = new JLabel("");

    Integer money = 0;
    CheckBoxItemEventEx(){
        defaultSetting();
        eventManager();
        panelManger();
    }
    public void defaultSetting() {
        setTitle("텍스트영역만들기");
        setSize(250,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void eventManager() {
        aCheckBox.addItemListener(this);
        bCheckBox.addItemListener(this);
        cCheckBox.addItemListener(this);
    }
    public void panelManger() {
        JPanel panel = new JPanel();

        panel.add(lb);
        panel.add(aCheckBox);
        panel.add(bCheckBox);
        panel.add(cCheckBox);
        panel.add(lbResult);

        add(panel);
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getStateChange() == ItemEvent.SELECTED){
           if(e.getSource() == aCheckBox){
               money += 100;
           }else if(e.getSource() == bCheckBox){
               money += 500;
           }else if(e.getSource() == cCheckBox){
               money += 2000;
           }
        }else if(e.getStateChange() == ItemEvent.DESELECTED){
            if(e.getSource() == aCheckBox){
                money -= 100;
            }else if(e.getSource() == bCheckBox){
                money -= 500;
            }else if(e.getSource() == cCheckBox){
                money -= 2000;
            }
        }
        lbResult.setText("현재 " + money + "원입니다.");
    }
    public static void main(String[] args) {

        new CheckBoxItemEventEx();

    }
}
