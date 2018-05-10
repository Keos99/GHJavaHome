package GeekUniversityHW.JavaAdvancedlevel.JavaAdvancedlevelHW4.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainChatWindow extends JFrame {

    private JTextArea chatTextArea;
    private JTextField userTextField;

    public MainChatWindow(){
        setVisible(true);
        setTitle("Главное окно чата");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        setSize(300,600);

        chatTextArea = new JTextArea(30,20);
        userTextField = new JTextField(10);

        chatTextArea.setText("Поле чата");
        chatTextArea.setEditable(false);
        chatTextArea.setLineWrap(true);
        userTextField.setText("Поле ввода");
        //userTextField.setEditable(true);
        userTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainChatWindow.this.sendMsg();
            }
        });

        JButton buttonEnterText = new JButton();
        buttonEnterText.setText("Отправить");
        buttonEnterText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMsg();
            }
        });

        add(chatTextArea,new GridBagConstraints(0,0,1,1,0.0,0.0,
                GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,
                new Insets(1,1,1,1),0,0));
        add(userTextField,new GridBagConstraints(0,1,1,1,0.0,0.0,
                GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,
                new Insets(1,1,1,1),0,0));
        add(buttonEnterText,new GridBagConstraints(0,2,1,1,0.0,0.0,
                GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,
                new Insets(1,1,1,1),0,0));

        validate();
    }

    public void sendMsg() {
        chatTextArea.append(userTextField.getText() + "\n");
        userTextField.setText("");
        userTextField.grabFocus();
    }
}
