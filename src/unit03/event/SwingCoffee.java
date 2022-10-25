package unit03.event;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingCoffee extends JFrame implements ItemListener {
    // ������ ���� �ɹ������� ����
    JRadioButton aRBtn = new JRadioButton("�Ƹ޸�ī��");
    JRadioButton bRBtn = new JRadioButton("��");
    JRadioButton cRBtn = new JRadioButton("īǪġ��");
    ButtonGroup buttonGroup = new ButtonGroup();
    JTextArea ta = new JTextArea("",7,20);
    JScrollPane sp = new JScrollPane(ta);

    SwingCoffee(){
        defaultSetting();
        eventManager();
        panelManger();
    }
    public void defaultSetting() {
        setTitle("Ŀ���ֹ�");
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
            ta.append(((AbstractButton)e.getItem()).getText() + "�� ���õǾ����ϴ�.\n");
        }else if(e.getStateChange() == ItemEvent.DESELECTED){
            ta.append(((AbstractButton)e.getItem()).getText() + "�� �����Ǿ����ϴ�.\n");
        }
    }
    public static void main(String[] args) {

        new SwingCoffee();

    }
}
