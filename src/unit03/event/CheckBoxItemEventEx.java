package unit03.event;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckBoxItemEventEx extends JFrame implements ItemListener {
    // ������ ���� �ɹ������� ����
    JLabel lb = new JLabel("��� : 100��, �� : 500��, ü�� : 2000��");
    JCheckBox aCheckBox = new JCheckBox("���");
    JCheckBox bCheckBox = new JCheckBox("��");
    JCheckBox cCheckBox = new JCheckBox("ü��");
    JLabel lbResult = new JLabel("");

    Integer money = 0;
    CheckBoxItemEventEx(){
        defaultSetting();
        eventManager();
        panelManger();
    }
    public void defaultSetting() {
        setTitle("�ؽ�Ʈ���������");
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
        lbResult.setText("���� " + money + "���Դϴ�.");
    }
    public static void main(String[] args) {

        new CheckBoxItemEventEx();

    }
}
